package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName TableClassRemark
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:05
 **/
public class TableClassRemark extends AbstractData implements IData {
    @Override
    public String getVariableName() {
        return "tableClass.remark";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
