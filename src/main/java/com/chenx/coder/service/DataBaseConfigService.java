package com.chenx.coder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenx.coder.pojo.entity.DataBaseConfig;

import java.util.List;

/**
 * @ClassName DBConfigService
 * @Description 数据库配置Service
 * @Author chenxiaowei
 * @Date 2023/8/29 09:58
 **/
public interface DataBaseConfigService extends IService<DataBaseConfig> {

    List<DataBaseConfig> getList();

    Boolean addConfig(DataBaseConfig dataBaseConfig);

    Boolean updateConfig(DataBaseConfig dataBaseConfig);

    Boolean deleteConfig(Long configId);
}
