package com.chenx.coder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenx.coder.mapper.TableMapper;
import com.chenx.coder.pojo.entity.TableDO;
import com.chenx.coder.service.TableService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TableServiceImpl
 * @Description 表Service
 * @Author daguniang
 * @Date 2023/8/27 17:40
 **/
@Service
public class TableServiceImpl extends ServiceImpl<TableMapper, TableDO> implements TableService {

    @Override
    public List<TableDO> getTableList(String schema) {
        List<TableDO> tableList = getBaseMapper().getTableList(schema);
        return tableList;
    }
}
