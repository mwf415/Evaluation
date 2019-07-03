package cn.onlov.evaluate.service;

import cn.onlov.evaluate.core.dao.entities.OnlovPermission;
import cn.onlov.evaluate.pojo.bo.CycleOnlovPermissionBo;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import java.util.Map;

/**
 * Created by yangqj on 2017/4/25.
 */
public interface OnlovPermissionService {
	IPage<OnlovPermission> selectByPage(CycleOnlovPermissionBo CyclePermission);
	List<OnlovPermission> queryAll();
	List<OnlovPermission> queryAllMenu();
	List<OnlovPermission> loadUserCyclePermissions(Map<String, Object> map);
	List<OnlovPermission> queryCyclePermissionsListWithSelected(Integer rid);
	List<OnlovPermission> loadUserCyclePermissionsTree(Integer userId);
	List<OnlovPermission> updateUserCyclePermissionsTree(Integer userId);
	void deleteByKeys(String[] keys);
}
