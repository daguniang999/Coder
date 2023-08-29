package com.chenx.coder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenx.coder.pojo.entity.TableDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName TableMapper
 * @Description 表Mapper
 * @Author daguniang
 * @Date 2023/8/27 17:42
 **/
public interface TableMapper extends BaseMapper<TableDO> {
    /**
     * 获取数据库所有的表
     * @param schema 数据库名称
     * @return
     */
    List<TableDO> getTableList(@Param("schema") String schema);
}
