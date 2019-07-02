package cn.onlov.evaluate.core.dao.impl;

import cn.onlov.evaluate.core.dao.entities.EEvaluateTableItem;
import cn.onlov.evaluate.core.dao.mapper.EEvaluateTableItemMapper;
import cn.onlov.evaluate.core.dao.interfaces.IEEvaluateTableItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评估表与评估项关联表 服务实现类
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Service
public class EEvaluateTableItemServiceImpl extends ServiceImpl<EEvaluateTableItemMapper, EEvaluateTableItem> implements IEEvaluateTableItemService {

}
