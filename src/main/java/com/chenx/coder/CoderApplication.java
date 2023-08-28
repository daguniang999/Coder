package com.chenx.coder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName CoderApplication
 * @Description Coder启动类
 * @Author chenxiaowei
 * @Date 2023/7/5 13:56
 **/
@SpringBootApplication
@MapperScan("com.chenx.coder.mapper")
public class CoderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoderApplication.class, args);
    }
}
