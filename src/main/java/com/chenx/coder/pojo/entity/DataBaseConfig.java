package com.chenx.coder.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName DataBaseConfig
 * @Description 数据库配置
 * @Author daguniang
 * @Date 2023/8/27 19:22
 **/
@Data
@TableName("database_config")
public class DataBaseConfig {

    @TableId("config_id")
    private Long configId;

    private String name;

    private String ip;

    private String port;

    private String schema;

    private String username;

    private String password;

    private String version;
}
