package com.chenx.coder.common;

import org.springframework.stereotype.Component;

/**
 * @ClassName ActiveDB
 * @Description 全局设置生效的数据库
 * @Author daguniang
 * @Date 2023/8/31 07:14
 **/
@Component
public class ActiveDB {

    private String activeName;

    public synchronized String getActiveName() {
        return activeName;
    }

    public synchronized void setActiveName(String activeName) {
        this.activeName = activeName;
    }
}
