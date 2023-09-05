package com.chenx.coder.engine.data.process;

import com.chenx.coder.engine.data.base.AbstractData;
import com.chenx.coder.engine.data.base.IData;
import org.springframework.stereotype.Component;

/**
 * @ClassName TableClassFullClassName
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 15:42
 **/
@Component
public class TableClassFullClassName extends AbstractData implements IData {

    @Override
    public String getVariableName() {
        return "tableClass.fullClassName";
    }

    @Override
    public Object getData(Long templateId, String tableName) {
        return null;
    }
}