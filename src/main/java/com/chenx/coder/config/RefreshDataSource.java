package com.chenx.coder.config;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.chenx.coder.common.ActiveDB;
import com.chenx.coder.pojo.entity.DataBaseConfig;
import com.chenx.coder.service.DataBaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @ClassName RefreshDataSource
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/30 16:43
 **/
@Component
public class RefreshDataSource implements CommandLineRunner {

    @Autowired
    ActiveDB activeDB;

    @Autowired
    DynamicRoutingDataSource dynamicRoutingDataSource;

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Autowired
    private DataBaseConfigService dataBaseConfigService;

    @Override
    public void run(String... args) throws Exception {

        List<DataBaseConfig> list = dataBaseConfigService.getList();
        for (DataBaseConfig dataBaseConfig : list) {
            dynamicRoutingDataSource.addDataSource(dataBaseConfig.getName(), DataSourceBuilder.create()
                    .url(dataBaseConfig.getUrl())
                    .driverClassName(dataBaseConfig.getDriver())
                    .username(dataBaseConfig.getUsername())
                    .password(dataBaseConfig.getPassword())
                    .build()
            );
            activeDB.setActiveName(dataBaseConfig.getName());
        }
    }
}
