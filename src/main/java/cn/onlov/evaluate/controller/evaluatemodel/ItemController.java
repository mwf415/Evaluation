package cn.onlov.evaluate.controller.evaluatemodel;

import cn.onlov.evaluate.core.dao.entities.EEvaluateItem;
import cn.onlov.evaluate.core.dao.interfaces.IEEvaluateItemService;
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
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private IEEvaluateItemService ieEvaluateItemServicee;

    @RequestMapping
    public Map<String, Object> getAll(EEvaluateItem evaluateItem, String draw,
                                      @RequestParam(required = false, defaultValue = "1") int start,
                                      @RequestParam(required = false, defaultValue = "10") int length) {

        Map<String,Object> map = new HashMap<>();
        LambdaQueryWrapper<EEvaluateItem> queryWrapper = new QueryWrapper<EEvaluateItem>().lambda();
        IPage<EEvaluateItem> page = new Page<>();
        page.setCurrent(MyPageUtil.currPage(start,length)).setSize(length);
        IPage<EEvaluateItem> res = ieEvaluateItemServicee.page(page, new QueryWrapper<EEvaluateItem>().lambda());
        map.put("draw",draw);
        map.put("recordsTotal",res.getTotal());
        map.put("recordsFiltered",res.getTotal());
        map.put("data", res.getRecords());
        return map;
    }


}
