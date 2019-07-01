package cn.onlov.evaluate.service;

import cn.onlov.evaluate.core.dao.entities.OnlovRole;
import cn.onlov.evaluate.pojo.bo.OnlovRoleBo;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public interface CycleRoleService  {

    public List<OnlovRole> queryCycleRoleListWithSelected(Integer uid);

    IPage<OnlovRole> selectByPage(OnlovRoleBo CycleRole);

    /**
     * 删除角色 同时删除角色资源表中的数据
     * @param CycleRoleid
     */
    public void delCycleRole(Integer CycleRoleid);

    /**
     * @Description:获取用户角色
     * @fieldName:
     * @return: List<OnlovRole>
     */
    public List<OnlovRole> queryCycleRoleListByUserId(Integer userId);

}
