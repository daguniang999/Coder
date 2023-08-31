package com.chenx.coder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenx.coder.pojo.entity.TableFieldDO;

import java.util.List;

/**
 * @ClassName TableFieldService
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/31 18:56
 **/
public interface TableFieldService extends IService<TableFieldDO> {

    List<TableFieldDO> getTableField(String tableName, String schema);
}
