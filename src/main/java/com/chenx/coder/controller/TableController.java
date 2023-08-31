package com.chenx.coder.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.chenx.coder.config.DbSourceContext;
import com.chenx.coder.pojo.entity.TableDO;
import com.chenx.coder.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TableController
 * @Description 表Controller
 * @Author daguniang
 * @Date 2023/8/27 17:36
 **/
@RestController
@RequestMapping("/table")
public class TableController {

    @Autowired
    private TableService tableService;

    /**
     * 获取所有的表列表
     * @return
     */
    @GetMapping("/list")
    public List<TableDO> getTableList(@RequestParam("schema") String schema) {
        DynamicDataSourceContextHolder.push("mac");
        return tableService.getTableList(schema);
        //
    }
}
