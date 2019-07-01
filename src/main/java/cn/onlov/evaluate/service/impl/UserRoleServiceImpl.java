package cn.onlov.evaluate.service.impl;

import cn.onlov.evaluate.core.dao.entities.OnlovUserRole;
import cn.onlov.evaluate.core.dao.interfaces.IUserRoleService;
import cn.onlov.evaluate.service.CyclePermissionService;
import cn.onlov.evaluate.service.CycleUserRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@Service
@Transactional
public class UserRoleServiceImpl implements CycleUserRoleService {

    @Resource
    private CyclePermissionService cyclePermissionService;

    @Resource
    private IUserRoleService iUserRoleService;


    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = {Exception.class})
    public void addUserRole(long userId, Long[] roleIds) {
        QueryWrapper<OnlovUserRole> queryWrapper = new QueryWrapper<>();

        iUserRoleService.remove(queryWrapper.lambda().eq(OnlovUserRole::getUid, userId));


        //添加
        for (Long roleId : roleIds) {
            OnlovUserRole u = new OnlovUserRole();
            u.setUid(userId);
            u.setRid(roleId);
            iUserRoleService.saveOrUpdate(u);
        }
        /**
         * 更新权限
         */
        // 权限redis更新
        cyclePermissionService.updateUserCyclePermissionsTree((int) userId);

    }
}
