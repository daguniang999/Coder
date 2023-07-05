package com.chenx.coder.controller;

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

    @GetMapping("/test")
    public String test() {
        return "1";
    }
}
