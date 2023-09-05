package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName BaseInfoBaseFields
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:07
 **/
public class BaseInfoBaseFields extends AbstractData implements IData {
    @Override
    public String getVariableName() {
        return "baseInfo.baseFields";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
