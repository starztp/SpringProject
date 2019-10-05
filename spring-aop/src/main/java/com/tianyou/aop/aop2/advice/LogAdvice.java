package com.tianyou.aop.aop2.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 方法前置通知，在方法调用前执行
 */
public class LogAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("方法名称："+method.getName());
        System.out.println("方法参数："+ Arrays.toString(args));
        System.out.println("目标对象："+target);
    }
}
