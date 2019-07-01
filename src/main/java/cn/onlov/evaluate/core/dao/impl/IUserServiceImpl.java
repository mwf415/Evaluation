package cn.onlov.evaluate.core.dao.impl;

import cn.onlov.cycle.core.dao.entities.User;
import cn.onlov.cycle.core.dao.mapper.UserMapper;
import cn.onlov.cycle.core.dao.interfaces.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kaifa
 * @since 2019-01-04
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
