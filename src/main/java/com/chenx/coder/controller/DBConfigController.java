package com.chenx.coder.controller;

import cn.hutool.core.io.IoUtil;
import com.alibaba.fastjson.JSONArray;
import com.chenx.coder.common.ResponseInfo;
import com.chenx.coder.pojo.entity.DataBaseConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName DBConfigController
 * @Description 数据库配置Controller
 * @Author daguniang
 * @Date 2023/8/27 19:21
 **/
@RestController
@RequestMapping("/db/config")
public class DBConfigController {

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseInfo<List<DataBaseConfig>> getDBConfigList() {
        InputStream resourceAsStream = DataBaseConfig.class.getClassLoader().getResourceAsStream("config/database.json");
        JSONArray objects = JSONArray.parseArray(IoUtil.read(resourceAsStream, "utf-8"));
        List<DataBaseConfig> dataBaseConfigs = objects.toJavaList(DataBaseConfig.class);
        return ResponseInfo.ok(dataBaseConfigs);
    }

}
