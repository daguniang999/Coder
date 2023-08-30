package com.chenx.coder.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DbSourceConfig
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/30 14:22
 **/
@Configuration
public class DbSourceConfig {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .url(dataSourceProperties.getUrl())
                .driverClassName(dataSourceProperties.getDriverClassName())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .build();
    }

    /*
     * 动态数据源
     * dbMap中存放数据源名称与数据源实例，数据源名称存于DataEnum.DbSource中
     * setDefaultTargetDataSource方法设置默认数据源
     */
    @Bean
    public DynamicDataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //配置多数据源
        Map<Object, Object> dbMap = new HashMap();
        dbMap.put("main", dataSource());
        dynamicDataSource.setTargetDataSources(dbMap);

        // 设置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(dataSource());

        return dynamicDataSource;
    }

    /*
     * 数据库连接会话工厂
     * 将动态数据源赋给工厂
     * mapper存于resources/mapper目录下
     * 默认bean存于com.main.example.bean包或子包下，也可直接在mapper中指定
     */
    @Bean(name = "sqlSessionFactory")
    public MybatisSqlSessionFactoryBean sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:com/chenx/**/mapper/sql/*.xml"));    // 扫描映射文件
        return sqlSessionFactoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        // 配置事务管理, 使用事务时在方法头部添加@Transactional注解即可
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}
