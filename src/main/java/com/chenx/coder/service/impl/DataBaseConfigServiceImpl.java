package com.chenx.coder.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenx.coder.common.ActiveDB;
import com.chenx.coder.mapper.DataBaseConfigMapper;
import com.chenx.coder.pojo.entity.DataBaseConfig;
import com.chenx.coder.service.DataBaseConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

/**
 * @ClassName DBConfigServiceImpl
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/29 09:58
 **/
@Service
public class DataBaseConfigServiceImpl extends ServiceImpl<DataBaseConfigMapper, DataBaseConfig> implements DataBaseConfigService {

    @Autowired
    private ActiveDB activeDB;

    @Override
    public List<DataBaseConfig> getList() {
        return getBaseMapper().selectList(new LambdaQueryWrapper<>());
    }

    @Override
    public Boolean addConfig(DataBaseConfig dataBaseConfig) throws Exception {
        DataBaseConfig one = getBaseMapper().selectOne(new LambdaQueryWrapper<DataBaseConfig>()
                .eq(DataBaseConfig::getName, dataBaseConfig.getName()));
        if (one != null) {
            throw new Exception("配置名称重复");
        }
        int count = getBaseMapper().insert(dataBaseConfig);
        return true;
    }

    @Override
    public Boolean updateConfig(DataBaseConfig dataBaseConfig) throws Exception {
        DataBaseConfig one = getBaseMapper().selectOne(new LambdaQueryWrapper<DataBaseConfig>()
                .eq(DataBaseConfig::getName, dataBaseConfig.getName())
                .ne(DataBaseConfig::getConfigId, dataBaseConfig.getConfigId()));
        if (one != null) {
            throw new Exception("配置名称重复");
        }
        int count = getBaseMapper().updateById(dataBaseConfig);
        return true;
    }

    @Override
    public Boolean deleteConfig(Long configId) {
        int count = getBaseMapper().deleteById(configId);
        return true;
    }

    @Override
    public DataBaseConfig getActiveConfig() {
        String activeName = activeDB.getActiveName();
        DataBaseConfig dataBaseConfig = getBaseMapper().selectOne(new LambdaQueryWrapper<DataBaseConfig>()
                .eq(DataBaseConfig::getName, activeName));
        return dataBaseConfig;
    }

    @Override
    public Boolean updateActiveConfig(Long configId) {
        DataBaseConfig dataBaseConfig = getBaseMapper().selectById(configId);
        activeDB.setActiveName(dataBaseConfig.getName());
        return true;
    }
}
