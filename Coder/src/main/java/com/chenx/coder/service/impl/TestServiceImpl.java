package com.chenx.coder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenx.coder.mapper.TestMapper;
import com.chenx.coder.pojo.entity.Test;
import com.chenx.coder.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author daguniang
 * @Date 2023/7/13 07:03
 **/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {
}
