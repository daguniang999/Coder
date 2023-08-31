package com.chenx.coder.controller;

import com.chenx.coder.common.ResponseInfo;
import com.chenx.coder.config.DB;
import com.chenx.coder.pojo.entity.TableFieldDO;
import com.chenx.coder.service.TableFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TableFieldController
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/31 17:47
 **/
@RestController
@RequestMapping("/table/field")
public class TableFieldController {

    @Autowired
    private TableFieldService tableFieldService;

    @GetMapping
    @DB
    ResponseInfo<List<TableFieldDO>> getTableField(@RequestParam("tableName") String tableName, @RequestParam("schema") String schema) {
        return ResponseInfo.ok(tableFieldService.getTableField(tableName, schema));
    }

}
