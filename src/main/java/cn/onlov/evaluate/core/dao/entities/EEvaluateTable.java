package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EEvaluateTable implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
     * 评分表ID
     */
         @TableId(value = "table_id", type = IdType.ID_WORKER)
    private Integer tableId;

        /**
     * 评分名称
     */
         private String tableName;

        /**
     * 评分表描述
     */
         private String tableDesc;

        /**
     * 适用关联关系
     */
         private Integer relateId;

        /**
     * 创建人Id
     */
         private Integer createUserId;

        /**
     * 创建人名称
     */
         private String createUserName;


}
