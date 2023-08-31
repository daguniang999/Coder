package com.chenx.coder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenx.coder.mapper.TableFieldMapper;
import com.chenx.coder.pojo.entity.TableFieldDO;
import com.chenx.coder.service.TableFieldService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TableFieldServiceImpl
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/31 18:56
 **/
@Service
public class TableFieldServiceImpl extends ServiceImpl<TableFieldMapper, TableFieldDO> implements TableFieldService {

    @Override
    public List<TableFieldDO> getTableField(String tableName, String schema) {
        return getBaseMapper().getTableField(tableName, schema);
    }

}
