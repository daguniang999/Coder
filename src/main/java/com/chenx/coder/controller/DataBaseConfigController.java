package com.chenx.coder.controller;

import com.chenx.coder.common.ResponseInfo;
import com.chenx.coder.config.DB;
import com.chenx.coder.config.DbSourceContext;
import com.chenx.coder.pojo.entity.DataBaseConfig;
import com.chenx.coder.service.DataBaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName DBConfigController
 * @Description 数据库配置Controller
 * @Author daguniang
 * @Date 2023/8/27 19:21
 **/
@RestController
@RequestMapping("/db/config")
public class DataBaseConfigController {

    @Autowired
    private DataBaseConfigService dataBaseConfigService;

    @GetMapping(value = "/list")
    @DB(active = "main")
    public ResponseInfo<List<DataBaseConfig>> getDBConfigList() {
        return ResponseInfo.ok(dataBaseConfigService.getList());
    }

    @GetMapping("/{configId}")
    @DB(active = "main")
    public ResponseInfo<DataBaseConfig> getDBConfig(@PathVariable("configId") Long configId) {
        DbSourceContext.setDbSource("main");
        return ResponseInfo.ok(dataBaseConfigService.getById(configId));
    }

    @PostMapping
    @DB(active = "main")
    public ResponseInfo<Boolean> addConfig(@RequestBody DataBaseConfig dataBaseConfig) throws Exception {
        DbSourceContext.setDbSource("mainDataSource");
        return ResponseInfo.ok(dataBaseConfigService.addConfig(dataBaseConfig));
    }

    @PutMapping
    @DB(active = "main")
    public ResponseInfo<Boolean> updateDBConfig(@RequestBody DataBaseConfig dataBaseConfig) throws Exception {
        return ResponseInfo.ok(dataBaseConfigService.updateConfig(dataBaseConfig));
    }

    @DeleteMapping("/{configId}")
    @DB(active = "main")
    public ResponseInfo<Boolean> deleteDBConfig(@PathVariable("configId") Long configId) {
        return ResponseInfo.ok(dataBaseConfigService.deleteConfig(configId));
    }

    @PutMapping("/active")
    public ResponseInfo<Boolean> updateActiveDB(@RequestParam("configId") Long configId) {
        return ResponseInfo.ok(dataBaseConfigService.updateActiveConfig(configId));
    }

    @GetMapping("/active")
    public ResponseInfo<Boolean> getActiveDB() {
        return ResponseInfo.ok(dataBaseConfigService.getActiveConfig());
    }


}
