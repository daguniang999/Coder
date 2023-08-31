package com.chenx.coder.pojo.entity;

import lombok.Data;

/**
 * @ClassName TableFieldDO
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/31 17:52
 **/
@Data
public class TableFieldDO {

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String columnName;

    private Integer ordinalPosition;

    private String columnDefault;

    private String isNullable;

    private String dataType;

    private Integer characterMaximumLength;

    private Integer characterOctetLength;

    private String numericPrecision;

    private String numericScale;

    private String datetimePrecision;

    private String characterSetName;

    private String collationName;

    private String columnType;

    private String columnKey;

    private String extra;

    private String privileges;

    private String columnComment;

    private String generationExpression;

    private String srsId;

}
