package com.chenx.coder.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName Test
 * @Description TODO
 * @Author daguniang
 * @Date 2023/7/12 07:54
 **/
@TableName(value = "test")
@Data
public class Test {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    private String name;
}
