package com.chenx.coder.controller;

import com.chenx.coder.pojo.entity.SchemaDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName SchemaController
 * @Description TODO
 * @Author daguniang
 * @Date 2023/8/27 18:54
 **/
@RestController
@RequestMapping("/schema")
public class SchemaController {

    @GetMapping("/list")
    public List<SchemaDO> getSchemaList(@RequestParam("configId") Long configId) {
        return null;
    }
}
