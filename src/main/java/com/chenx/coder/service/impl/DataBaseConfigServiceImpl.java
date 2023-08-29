package com.chenx.coder.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenx.coder.mapper.DataBaseConfigMapper;
import com.chenx.coder.pojo.entity.DataBaseConfig;
import com.chenx.coder.service.DataBaseConfigService;
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

    @Override
    public List<DataBaseConfig> getList() {
        return getBaseMapper().selectList(new LambdaQueryWrapper<>());
    }

    @Override
    public Boolean addConfig(DataBaseConfig dataBaseConfig) {
        int count = getBaseMapper().insert(dataBaseConfig);
        return true;
    }

    @Override
    public Boolean updateConfig(DataBaseConfig dataBaseConfig) {
        int count = getBaseMapper().updateById(dataBaseConfig);
        return true;
    }

    @Override
    public Boolean deleteConfig(Long configId) {
        int count = getBaseMapper().deleteById(configId);
        return true;
    }
}
