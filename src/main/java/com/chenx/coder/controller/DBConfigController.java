package com.chenx.coder.controller;

import cn.hutool.core.io.IoUtil;
import com.alibaba.fastjson.JSONArray;
import com.chenx.coder.pojo.entity.DataBaseConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName DBConfigController
 * @Description TODO
 * @Author daguniang
 * @Date 2023/8/27 19:21
 **/
@RestController
@RequestMapping("/db/config")
public class DBConfigController {

    @GetMapping("/list")
    public List<DataBaseConfig> getDBConfigList() {
        InputStream resourceAsStream = DataBaseConfig.class.getClassLoader().getResourceAsStream("config/database.json");
        JSONArray objects = JSONArray.parseArray(IoUtil.read(resourceAsStream, "utf-8"));
        System.out.println(objects);
        return Collections.emptyList();
    }
}
