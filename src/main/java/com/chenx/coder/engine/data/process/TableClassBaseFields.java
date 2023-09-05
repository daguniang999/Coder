package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName TableClassBaseFields
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:05
 **/
public class TableClassBaseFields extends AbstractData implements IData {
    @Override
    public String getVariableName() {
        return "tableClass.baseFields";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
