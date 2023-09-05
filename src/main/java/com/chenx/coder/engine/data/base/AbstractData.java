package com.chenx.coder.engine.data.base;

import com.chenx.coder.service.TableFieldService;
import com.chenx.coder.service.TableService;
import com.chenx.coder.service.VariableService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName AbstractData
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 15:43
 **/
public abstract class AbstractData {

    @Autowired
    protected VariableService variableService;

    @Autowired
    protected TableService tableService;

    @Autowired
    protected TableFieldService tableFieldService;
}
