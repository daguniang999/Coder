package com.chenx.coder.engine.data.base;

import com.chenx.coder.service.VariableService;

/**
 * @ClassName IData
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 15:41
 **/
public interface IData<T> {

    String getVariableName();

    T getData(Long templateId, String tableName);
}
