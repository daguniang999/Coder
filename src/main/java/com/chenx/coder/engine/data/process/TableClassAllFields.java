package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName TableClassAllFields
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:05
 **/
public class TableClassAllFields extends AbstractData implements IData {
    @Override
    public String getVariableName() {
        return "tableClass.allFields";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
