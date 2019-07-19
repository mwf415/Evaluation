package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估项的选项表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EEvaluateItemOption implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
     * 选项ID
     */
         @TableId(value = "option_id", type = IdType.AUTO)
    private Integer optionId;

        /**
     * 评分项ID
     */
         private String itemId;

        /**
     * 选项名称
     */
         private String optionName;

        /**
     * 选项值
     */
         private String optionValue;


}
