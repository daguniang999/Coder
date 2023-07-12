package com.chenx.coder.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.chenx.coder.pojo.entity.Test;
import com.chenx.coder.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/7/5 13:54
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test() {
        Test one = testService.getOne(new LambdaQueryWrapper<>());
        System.out.println(one.getName());
        return one.getName();
    }
}
