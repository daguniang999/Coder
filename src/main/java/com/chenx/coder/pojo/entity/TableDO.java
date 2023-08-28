package com.chenx.coder.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName TableDO
 * @Description 表DO
 * @Author daguniang
 * @Date 2023/8/27 17:36
 **/
@Data
public class TableDO {

    private String tableCatalog;

    private String tableSchema;

    /**
     * 表名
     */
    private String tableName;

    private String tableType;

    private String engine;

    private Integer version;

    private String rowFormat;

    /**
     * 表行数
     */
    private Integer tableRows;

    private Integer avgRowLength;

    private Integer dataLength;

    private Integer maxDataLength;

    private Integer indexLength;

    private Integer dataFree;

    private String autoIncrement;

    private Date createTime;

    private Date updateTime;

    private Date checkTime;

    private String tableCollection;

    private Integer checkSum;

    private String createOptions;

    private String tableComment;

}
