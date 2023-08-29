package com.chenx.coder.pojo.entity;

import lombok.Data;

/**
 * @ClassName DataBaseConfig
 * @Description 数据库配置
 * @Author daguniang
 * @Date 2023/8/27 19:22
 **/
@Data
public class DataBaseConfig {

    private Long configId;

    private String name;

    private String ip;

    private String port;

    private String schema;

    private String username;

    private String password;

    private String version;
}
