package cn.onlov.evaluate.pojo.bo;

import cn.onlov.evaluate.core.dao.entities.OnlovRole;
import lombok.Data;

@Data
public class OnlovRoleBo extends OnlovRole {
    private static final long serialVersionUID = 318399374157993931L;
    private int curr = 0; //当前页数
    private int pageSize = 10;// 每页几行
}
