package cn.onlov.evaluate.service.impl;

import cn.onlov.evaluate.core.dao.entities.OnlovRole;
import cn.onlov.evaluate.core.dao.interfaces.IRoleService;
import cn.onlov.evaluate.pojo.bo.OnlovRoleBo;
import cn.onlov.evaluate.service.CycleRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CycleRoleServiceImpl  implements CycleRoleService {
    @Autowired
    private IRoleService iRoleService;

    @Override
    public List<OnlovRole> queryCycleRoleListWithSelected(Integer uid) {
        IPage<OnlovRole> page = new Page<>();
//        page.setCurrent(bo.getCurr()).setSize(bo.getPageSize());
//        boolean a = MyStringUtils.isNotEmpty(bo.getBaseName());


        return null;
    }

    @Override
    public IPage<OnlovRole> selectByPage(OnlovRoleBo bo) {
        QueryWrapper<OnlovRole> queryWrapper =  new QueryWrapper<>() ;

        IPage<OnlovRole> page = new Page<>();
        page.setCurrent(bo.getCurr()).setSize(bo.getPageSize());

        IPage<OnlovRole> res = iRoleService.page(page, new QueryWrapper<OnlovRole>().lambda());

        return res;
    }

    @Override
    public void delCycleRole(Integer roleid) {
        QueryWrapper<OnlovRole> queryWrapper =  new QueryWrapper<>();
        iRoleService.remove(queryWrapper.lambda().eq(OnlovRole::getRoleId ,roleid));
    }

    @Override
    public List<OnlovRole> queryCycleRoleListByUserId(Integer userId) {
        QueryWrapper<OnlovRole> queryWrapper =  new QueryWrapper<>();
        List<OnlovRole> onlovRoles = iRoleService.queryRoleListByUserId(userId);
        return onlovRoles;
    }

}
