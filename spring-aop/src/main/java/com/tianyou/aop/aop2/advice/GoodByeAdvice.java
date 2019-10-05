package com.tianyou.aop.aop2.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 后置通知
 */
public class GoodByeAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("target:"+target);
        System.out.println("method:"+method.getName());
        System.out.println("args:"+ Arrays.toString(args));
        System.out.println("returnvalue:"+returnValue);
    }
}
