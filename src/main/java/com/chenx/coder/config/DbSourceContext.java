package com.chenx.coder.config;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DbSourceContext {

    private static final ThreadLocal<String> dbContext = new ThreadLocal<String>();

    public static void setDbSource(String source) {
        log.debug("set source ====>" + source);
        dbContext.set(source);
    }

    public static String getDbSource() {
        log.debug("get source ====>" + dbContext.get());
        return dbContext.get();
    }

    public static void clearDbSource() {
        dbContext.remove();
    }
}