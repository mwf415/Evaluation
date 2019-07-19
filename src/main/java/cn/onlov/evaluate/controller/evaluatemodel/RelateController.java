package cn.onlov.evaluate.controller.evaluatemodel;

import cn.onlov.evaluate.core.dao.entities.EEvaluateRelate;
import cn.onlov.evaluate.core.dao.interfaces.IEEvaluateRelateService;
import cn.onlov.utils.MyPageUtil;
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
@RequestMapping("/relates")
public class RelateController {

    @Autowired
    private IEEvaluateRelateService ieEvaluateRelateService;

    @RequestMapping
    public Map<String, Object> getAll(EEvaluateRelate eEvaluateRelate, String draw,
                                      @RequestParam(required = false, defaultValue = "1") int start,
                                      @RequestParam(required = false, defaultValue = "10") int length) {

        Map<String,Object> map = new HashMap<>();
        LambdaQueryWrapper<EEvaluateRelate> queryWrapper = new QueryWrapper<EEvaluateRelate>().lambda();
        IPage<EEvaluateRelate> page = new Page<>();
        page.setCurrent(MyPageUtil.currPage(start,length)).setSize(length);
        IPage<EEvaluateRelate> res = ieEvaluateRelateService.page(page, new QueryWrapper<EEvaluateRelate>().lambda());
        map.put("draw",draw);
        map.put("recordsTotal",res.getTotal());
        map.put("recordsFiltered",res.getTotal());
        map.put("data", res.getRecords());
        return map;
    }


}
