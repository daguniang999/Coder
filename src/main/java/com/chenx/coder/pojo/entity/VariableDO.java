package com.chenx.coder.pojo.entity;

import lombok.Data;

/**
 * @ClassName VariableDO
 * @Description 变量DO
 * @Author chenxiaowei
 * @Date 2023/9/5 09:54
 **/
@Data
public class VariableDO {

    private Long variableId;

    private String name;

    private String variable;

    private Integer isDefault;

    private String alias;

    private String description;

}
