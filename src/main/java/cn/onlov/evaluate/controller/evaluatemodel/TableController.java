package cn.onlov.evaluate.controller.evaluatemodel;

import cn.onlov.evaluate.core.dao.entities.EEvaluateTable;
import cn.onlov.evaluate.core.dao.interfaces.IEEvaluateTableService;
import cn.onlov.evaluate.util.MyPageUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/tables")
public class TableController {

    @Autowired
    private IEEvaluateTableService ieEvaluateTableService;

    @RequestMapping
    public Map<String, Object> getAll(EEvaluateTable eEvaluateTable, String draw,
                                      @RequestParam(required = false, defaultValue = "1") int start,
                                      @RequestParam(required = false, defaultValue = "10") int length) {

        Map<String,Object> map = new HashMap<>();
        LambdaQueryWrapper<EEvaluateTable> queryWrapper = new QueryWrapper<EEvaluateTable>().lambda();
        IPage<EEvaluateTable> page = new Page<>();
        page.setCurrent(MyPageUtil.currPage(start,length)).setSize(length);
        IPage<EEvaluateTable> res = ieEvaluateTableService.page(page, new QueryWrapper<EEvaluateTable>().lambda());
        map.put("draw",draw);
        map.put("recordsTotal",res.getTotal());
        map.put("recordsFiltered",res.getTotal());
        map.put("data", res.getRecords());
        return map;
    }


}
