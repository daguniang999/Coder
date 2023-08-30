package com.chenx.coder.common;

/**
 * @ClassName ActiveDB
 * @Description 全局设置生效的数据库
 * @Author daguniang
 * @Date 2023/8/31 07:14
 **/
public class ActiveDB {

    private static Long configId;

    public synchronized static Long getConfigId() {
        return configId;
    }

    public synchronized static void setConfigId(Long configId) {
        configId = configId;
    }
}
