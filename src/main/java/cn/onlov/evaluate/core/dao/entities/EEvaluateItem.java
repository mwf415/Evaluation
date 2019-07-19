package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估项表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EEvaluateItem implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
     * 评分项Id
     */
         @TableId(value = "item_id", type = IdType.AUTO)
    private Integer itemId;

        /**
     * 评分项名称
     */
         private String itemName;

        /**
     * 评分项分类ID
     */
         private Integer catalogId;

        /**
     * 评分项分类名称
     */
         private String catalogName;

    private Integer createUserId;

    private String createUserName;


}
