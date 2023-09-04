package com.chenx.coder.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import com.chenx.coder.common.ExportUtil;
import com.chenx.coder.common.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
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
        String filePath = "template/deliverDemo.ftl";
        FreeMarkerTemplateUtils utils = new FreeMarkerTemplateUtils();

        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("name", "cxw");
        String content = utils.getData(filePath,map);
        ExportUtil.exportClassPath(filePath, content);
        return content;
    }
}
