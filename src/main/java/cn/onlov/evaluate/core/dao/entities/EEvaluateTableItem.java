package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估表与评估项关联表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EEvaluateTableItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;

        /**
     * 评分表ID
     */
         private Integer tableId;

        /**
     * 选项ID
     */
         private Integer itemId;


}
