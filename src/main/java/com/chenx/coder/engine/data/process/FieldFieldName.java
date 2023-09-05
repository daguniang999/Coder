package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName FieldFieldName
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:06
 **/
public class FieldFieldName extends AbstractData implements IData {

    @Override
    public String getVariableName() {
        return "field.fieldName";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
