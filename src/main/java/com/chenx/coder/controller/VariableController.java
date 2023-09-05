package com.chenx.coder.controller;

import com.chenx.coder.common.ResponseInfo;
import com.chenx.coder.pojo.entity.VariableDO;
import com.chenx.coder.service.VariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName VariableController
 * @Description 变量Controller
 * @Author chenxiaowei
 * @Date 2023/9/5 09:51
 **/
@RestController
@RequestMapping("/variable")
public class VariableController {

    @Autowired
    private VariableService variableService;

    @GetMapping("/list")
    public ResponseInfo<List<VariableDO>> getList() {
        List<VariableDO> list = new ArrayList<>();
        return ResponseInfo.ok(list);
    }

    @PutMapping
    public ResponseInfo<Boolean> updateVariable(@RequestBody VariableDO variableDO) {
        boolean ok = variableService.updateById(variableDO);
        return ResponseInfo.ok(ok);
    }

    @PostMapping
    public ResponseInfo<Boolean> addVariable(@RequestBody VariableDO variableDO) {
        boolean ok = variableService.save(variableDO);
        return ResponseInfo.ok(ok);
    }

    @DeleteMapping("/{variableId}")
    public ResponseInfo<Boolean> deleteVariable(@PathVariable("variableId") Long variableId) {
        boolean ok = variableService.removeById(variableId);
        return ResponseInfo.ok(ok);
    }
}