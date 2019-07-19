package cn.onlov.evaluate.core.dao.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评估分类表
 * </p>
 *
 * @author kaifa
 * @since 2019-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ECatalog implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
     * 分类ID
     */
         @TableId(value = "catalog_id", type = IdType.AUTO)
    private Integer catalogId;

        /**
     * 分类名称
     */
         private String catalogName;

        /**
     * 对应的角色ID
     */
         private Integer catalogRoleId;

        /**
     * 对应的角色名称
     */
         private String catalogRoleName;


}
