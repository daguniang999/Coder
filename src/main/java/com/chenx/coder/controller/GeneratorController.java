package com.chenx.coder.controller;

import com.chenx.coder.common.FreeMarkerTemplateUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringWriter;
import java.util.HashMap;

/**
 * @ClassName GeneratorController
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/9/2 14:50
 **/
@RestController
@RequestMapping("/generate")
public class GeneratorController {

    @GetMapping
    public String test() throws Exception {
        String filePath = "deliverDemo.ftl";
        FreeMarkerTemplateUtils utils = new FreeMarkerTemplateUtils();

        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("cityId",110);
        String content = utils.getData(filePath,map);
        System.out.println(content);
        return content;
    }
}
