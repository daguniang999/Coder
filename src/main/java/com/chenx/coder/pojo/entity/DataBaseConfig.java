package com.chenx.coder.pojo.entity;

import lombok.Data;

/**
 * @ClassName DataBaseConfig
 * @Description TODO
 * @Author daguniang
 * @Date 2023/8/27 19:22
 **/
@Data
public class DataBaseConfig {

    private String name;

    private String ip;

    private String port;

    private String schema;

    private String username;

    private String password;

    private String version;
}
