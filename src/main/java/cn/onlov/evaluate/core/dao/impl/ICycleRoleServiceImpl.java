package cn.onlov.evaluate.core.dao.impl;

import cn.onlov.evaluate.core.dao.entities.CycleRole;
import cn.onlov.evaluate.core.dao.interfaces.ICycleRoleService;
import cn.onlov.evaluate.core.dao.mapper.CycleRoleMapper;
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
