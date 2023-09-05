package com.chenx.coder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenx.coder.mapper.VariableMapper;
import com.chenx.coder.pojo.entity.VariableDO;
import com.chenx.coder.service.VariableService;
import org.springframework.stereotype.Service;

/**
 * @ClassName VariableServiceImpl
 * @Description 变量ServiceImpl
 * @Author chenxiaowei
 * @Date 2023/9/5 14:47
 **/
@Service
public class VariableServiceImpl extends ServiceImpl<VariableMapper, VariableDO> implements VariableService {
}
