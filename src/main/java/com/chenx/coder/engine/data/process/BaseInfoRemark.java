package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;

/**
 * @ClassName BaseInfoRemark
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 16:08
 **/
public class BaseInfoRemark extends AbstractData implements IData {

    @Override
    public String getVariableName() {
        return "baseInfo.remark";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}
