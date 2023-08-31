package com.chenx.coder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenx.coder.pojo.entity.TableFieldDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName TableFieldMapper
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/31 17:50
 **/
public interface TableFieldMapper extends BaseMapper<TableFieldDO> {

    List<TableFieldDO> getTableField(@Param("tableName") String tableName, @Param("schema") String schema);

}
