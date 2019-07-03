package cn.onlov.evaluate.service;

import cn.onlov.evaluate.core.dao.entities.OnlovUser;
import cn.onlov.evaluate.pojo.bo.OnlovUserBo;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

public interface OnlovUserService {

	IPage<OnlovUser> getBusinessPageUser(OnlovUserBo bo) ;
	
	OnlovUser selectByLoginName(String loginName);
	
	void delUser(Integer userid);
	
	List<OnlovUser> selectByLoginNames(String[] loginNames);

}
