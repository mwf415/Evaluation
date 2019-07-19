package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估表与评估项关联表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EEvaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

        /**
     * 任务名称
     */
         private String name;

        /**
     * 任务期数
     */
         private String season;

        /**
     * 开始时间
     */
         private Date startTime;

        /**
     * 结束时间
     */
         private Date endTime;

        /**
     * 匹配状态 0 未匹配， 1 已匹配
     */
         private Integer matchType;

        /**
     * 评估状态
     */
         private Integer num;


}
