package cn.onlov.evaluate.core.dao.interfaces;

import cn.onlov.evaluate.core.dao.entities.CyclePermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kaifa
 * @since 2019-01-04
 */
public interface ICyclePermissionService extends IService<CyclePermission> {

    List<CyclePermission> loadUserPermissions(int id, int type);
    List<CyclePermission> queryPermissionsListWithSelected(int rid);


}
