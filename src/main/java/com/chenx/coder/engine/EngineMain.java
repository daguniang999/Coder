package com.chenx.coder.engine;

import com.chenx.coder.engine.data.base.DataFactory;
import com.chenx.coder.engine.data.base.IData;
import com.chenx.coder.pojo.entity.VariableDO;
import com.chenx.coder.service.VariableService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @ClassName EngineMain
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/5 15:36
 **/
@Component
public class EngineMain {

    private VariableService variableService;

    private DataFactory dataFactory;

    public Map<String, Object> getMap(Long templateId, String tableName) {

        Map<String, Object> dataMap = new HashMap<>();

        List<VariableDO> variableList = variableService.list();
        for (VariableDO varItem : variableList) {
            String key = Optional.ofNullable(varItem.getAlias()).orElse(varItem.getVariable());
            Object value = null;
            if (varItem.getIsDefault().equals(1)) {
                IData process = dataFactory.getProcess(varItem.getVariable());
                value = process.getData(templateId, tableName);
            } else {

            }
            dataMap.put(key, value);
        }

        return dataMap;
    }
}
