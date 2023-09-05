package com.chenx.coder.engine.data.base;

import com.chenx.coder.common.SpringBeanUtils;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName DataFactory
 * @Description dataFactory
 * @Author chenxiaowei
 * @Date 2023/9/5 15:50
 **/
public class DataFactory {

    private ConcurrentHashMap<String, IData> dataProcessMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        List<IData> beanList = SpringBeanUtils.getBeanList(IData.class);
        for (IData iData : beanList) {
            String variableName = iData.getVariableName();
            dataProcessMap.putIfAbsent(variableName, iData);
        }
    }

    public IData getProcess(String variableName) {
        IData iData = dataProcessMap.get(variableName);
        return iData;
    }
}
