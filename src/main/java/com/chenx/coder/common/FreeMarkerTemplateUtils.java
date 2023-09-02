package com.chenx.coder.common;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.HashMap;

public class FreeMarkerTemplateUtils {

    public String getData(String filePath, HashMap<Object, Object> map) throws Exception {
        StringWriter writer = new StringWriter();

        // 创建配置类
        Configuration cfg = new Configuration(Configuration.getVersion());
        cfg.setDirectoryForTemplateLoading(new File(this.getClass().getClassLoader().getResource("").getPath()));
        // 设置字符集
        cfg.setDefaultEncoding("UTF-8");

        // 加载模板
        Template template = cfg.getTemplate(filePath);
        // 静态化内容
        template.process(map,writer);
        String content = writer.toString();

        return content;
    }
}