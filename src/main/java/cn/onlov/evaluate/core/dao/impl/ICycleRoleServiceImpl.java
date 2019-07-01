package cn.onlov.evaluate.core.dao.impl;

import cn.onlov.cycle.core.dao.entities.CycleRole;
import cn.onlov.cycle.core.dao.mapper.CycleRoleMapper;
import cn.onlov.cycle.core.dao.interfaces.ICycleRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class ICycleRoleServiceImpl extends ServiceImpl<CycleRoleMapper, CycleRole> implements ICycleRoleService {


    @Autowired
    private  CycleRoleMapper cycleRoleMapper;

    @Override
    public List<CycleRole> queryRoleListByUserId(Integer roleId) {
        List<CycleRole> cycleRoles = cycleRoleMapper.queryRoleListByUserId(roleId);

        return cycleRoles;
    }
}
