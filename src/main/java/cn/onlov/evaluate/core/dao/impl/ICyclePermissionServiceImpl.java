package cn.onlov.evaluate.core.dao.impl;

import cn.onlov.cycle.core.dao.entities.CyclePermission;
import cn.onlov.cycle.core.dao.mapper.CyclePermissionMapper;
import cn.onlov.cycle.core.dao.interfaces.ICyclePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kaifa
 * @since 2019-01-04
 */
@Service
public class ICyclePermissionServiceImpl extends ServiceImpl<CyclePermissionMapper, CyclePermission> implements ICyclePermissionService {

    @Autowired
    private CyclePermissionMapper cyclePermissionMapper;

    @Override
    public List<CyclePermission> loadUserPermissions(int id,int type){
        List<CyclePermission> list = cyclePermissionMapper.loadUserPermissions(id, type);
        return list;
    }


    @Override
    public List<CyclePermission> queryPermissionsListWithSelected(int rid){
        List<CyclePermission> list = cyclePermissionMapper.queryPermissionsListWithSelected(rid);
        return list;
    }

}
