package com.tianyou.aop.aop2.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * 环绕通知
 */
public class TimeAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method=invocation.getMethod();
        Object[] args=invocation.getArguments();
        Object target=invocation.getThis();
        long starttime=System.currentTimeMillis();
        //执行业务方法，该方法执行之前的代码就是方法执行前的操作；该方法执行之后的代码就是方法执行后的操作
        //proceed就是业务方法执行之后的返回值
        Object proceed=invocation.proceed();
        long endtime=System.currentTimeMillis();
        System.out.println("方法执行时间:"+(endtime-starttime));
        return null;
    }
}
