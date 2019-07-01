package cn.onlov.evaluate.controller;


import cn.onlov.evaluate.core.dao.entities.CyclePermission;
import cn.onlov.evaluate.core.dao.interfaces.ICyclePermissionService;
import cn.onlov.evaluate.pojo.bo.CyclePermissionBo;
import cn.onlov.evaluate.service.CyclePermissionService;
import cn.onlov.evaluate.shiro.ShiroService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/permissions")
public class PermissionController {

    @Resource
    private CyclePermissionService cyclePermissionService;
    @Resource
    private ICyclePermissionService iCyclePermissionService;
    @Resource
    private ShiroService shiroService;

    @RequestMapping
    public Map<String,Object> getAll(CyclePermission permissions, String draw,
                                     @RequestParam(required = false, defaultValue = "1") int start,
                                     @RequestParam(required = false, defaultValue = "10") int length){
        Map<String,Object> map = new HashMap<>();
        CyclePermissionBo bo  = new CyclePermissionBo();
        BeanUtils.copyProperties(permissions,bo);
        bo.setCurr(start);
        bo.setPageSize(length);

        IPage<CyclePermission> pageInfo = cyclePermissionService.selectByPage(bo);
        map.put("draw",draw);
        map.put("recordsTotal",pageInfo.getTotal());
        map.put("recordsFiltered",pageInfo.getTotal());
        map.put("data", pageInfo.getRecords());
        return map;
    }

    @RequestMapping("/permissionsWithSelected")
    public List<CyclePermission> permissionsWithSelected(Integer rid){
        return cyclePermissionService.queryCyclePermissionsListWithSelected(rid);
    }

    @RequestMapping("/loadMenu")
    public List<CyclePermission> loadMenu(){
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userSessionId");
        List<CyclePermission> permissionsList = cyclePermissionService.loadUserCyclePermissionsTree(userId);
        return permissionsList;
    }

    @CacheEvict(cacheNames="permissions", allEntries=true)
    @RequestMapping(value = "/add")
    public String add(CyclePermission permission){
        try{
            iCyclePermissionService.saveOrUpdate(permission);
            //更新权限
            shiroService.updatePermission();
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    
    @CacheEvict(cacheNames="permissions", allEntries=true)
    @RequestMapping(value = "/update")
    public String update(CyclePermission permission){
        try{
            iCyclePermissionService.saveOrUpdate(permission);
            //更新权限
            shiroService.updatePermission();
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    
    @CacheEvict(cacheNames="permissions", allEntries=true)
    @RequestMapping(value = "/delete")
    public String delete(String ids){
        try{
        	if(StringUtils.isNotBlank(ids)){
        		cyclePermissionService.deleteByKeys(ids.split(","));
        		//更新权限
        		shiroService.updatePermission();
        		return "success";
        	}
        	 return "fail";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
    
}
