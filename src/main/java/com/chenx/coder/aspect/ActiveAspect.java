package com.chenx.coder.aspect;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.chenx.coder.common.ActiveDB;
import com.chenx.coder.config.DB;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

/**
 * @ClassName ActiveAspect
 * @Description TODO
 * @Author chenxiaowei
 * @Date 2023/8/31 17:16
 **/
@Component
@Aspect
public class ActiveAspect {

    @Autowired
    private ActiveDB activeDB;

    @Pointcut("@annotation(com.chenx.coder.config.DB)")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint p) throws Throwable {
        MethodSignature signature = (MethodSignature) p.getSignature();
        Method method = signature.getMethod();
        DB annotation = method.getAnnotation(DB.class);
        String active = annotation.active();
        if (StringUtils.hasText(active)) {
            DynamicDataSourceContextHolder.push(active);
        } else {
            String activeName = activeDB.getActiveName();
            DynamicDataSourceContextHolder.push(activeName);
        }

        Object result = p.proceed();
        return result;
    }
}
