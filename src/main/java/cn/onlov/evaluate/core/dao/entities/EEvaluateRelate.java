package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估关系表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class EEvaluateRelate implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
     * 分类ID
     */
         @TableId(value = "relate_id", type = IdType.AUTO)
    private Integer relateId;

        /**
     * 评估人角色ID 
     */
         private Integer masterRoleId;

        /**
     * 评估人角色
     */
         private String masterRoleName;

        /**
     * 被评估人角色ID
     */
         private Integer slaverRoleId;

        /**
     * 被评估人角色名 (考虑下对科室或者基地评估）
     */
         private String slaverRoleName;

        /**
     * 1  互评  2 单向评估 3 自我评估 
     */
         private Integer relateType;


}
