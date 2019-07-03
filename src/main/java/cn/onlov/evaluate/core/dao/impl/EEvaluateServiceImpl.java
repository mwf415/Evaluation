package cn.onlov.evaluate.core.dao.impl;

import cn.onlov.evaluate.core.dao.entities.EEvaluate;
import cn.onlov.evaluate.core.dao.mapper.EEvaluateMapper;
import cn.onlov.evaluate.core.dao.interfaces.IEEvaluateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评估表与评估项关联表 服务实现类
 * </p>
 *
 * @author kaifa
 * @since 2019-07-03
 */
@Service
public class EEvaluateServiceImpl extends ServiceImpl<EEvaluateMapper, EEvaluate> implements IEEvaluateService {

}
