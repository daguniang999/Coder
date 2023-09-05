package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName FieldColumnName
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:06
 **/
public class FieldColumnName extends AbstractData implements IData {

    @Override
    public String getVariableName() {
        return "field.columnName";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
