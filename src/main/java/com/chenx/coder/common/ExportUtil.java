package com.chenx.coder.common;

import cn.hutool.core.io.FileUtil;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName ExportUtil
 * @Description 导出Util
 * @Author chenxiaowei
 * @Date 2023/9/4 16:52
 **/
@Component
public class ExportUtil {

    /**
     * 导出到项目Classpath路径
     * @param fileName
     * @param content
     */
    public static void exportClassPath(String fileName, String content) {
        try {
            if (StringUtils.hasText(content)) {
                byte[] bytes = content.getBytes();
                String classPath = ExportUtil.class.getClassLoader().getResource("").getPath();
                String path = classPath + "/" + fileName + ".java";
                FileUtil.writeBytes(bytes, path);
            }
        } catch (Exception e) {
        }
    }

    public static void exportClassPath(File file) {

        try {
            String classPath = ExportUtil.class.getClassLoader().getResource("").getPath();
            String path = classPath + "/" + file.getName() + ".java";
            FileUtil.writeFromStream(new FileInputStream(file), path);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 导出到默认输出路径
     * @param file
     * @param dest
     */
    public static void exportOutPath(File file, String dest) {
        try {
            String path = dest + "/" + file.getName() + ".java";
            FileUtil.writeFromStream(new FileInputStream(file), path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 导出到外部路径
     * @param fileName
     * @param content
     * @param dest
     */
    public static void exportExternalPath(String fileName, String content, String dest) {
        try {
            if (StringUtils.hasText(content)) {
                byte[] bytes = content.getBytes();
                String path = dest + "/" + fileName + ".java";
                FileUtil.writeBytes(bytes, path);
            }
        } catch (Exception e) {
        }
    }
}
