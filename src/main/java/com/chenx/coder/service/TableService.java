package com.chenx.coder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenx.coder.pojo.entity.TableDO;

import java.util.List;

/**
 * @ClassName TableService
 * @Description 表Service
 * @Author daguniang
 * @Date 2023/8/27 17:40
 **/
public interface TableService extends IService<TableDO> {

    /**
     * 根据数据库名称获取所有的表
     * @param schema 数据库名称
     * @return
     */
    List<TableDO> getTableList(String schema);
}
