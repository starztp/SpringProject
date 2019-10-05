package com.tianyou.aop.aop3.Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 增强类，不实现接口的方式
 */
public class LogAdvice {

    //前置通知
    public void addlog(JoinPoint joinPoint){
        Object[] args=joinPoint.getArgs();//获取方法参数
        Object target=joinPoint.getTarget();//获取目标对象
        Signature signature=joinPoint.getSignature();//获取签名
        String methodname=signature.getName();//获取方法名称
        MethodSignature methodSignature=(MethodSignature)signature;//转化为方法签名
        Method method=methodSignature.getMethod();//获取method对象
        System.out.println("方法名称："+methodname);
        System.out.println("方法参数："+ Arrays.toString(args));
        System.out.println("目标对象："+target);
    }

    //后置通知
    public void addlogafter(JoinPoint joinPoint,Object returnvalue){
        System.out.println("后置通知");
    }

    //异常通知
    public void adviceexception(JoinPoint joinPoint,Exception e){
        System.out.println("异常通知");
    }

    //环绕通知
    public Object adviceCreatearound(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知方法执行前");
        Object proceed=joinPoint.proceed();
        System.out.println("环绕通知方法执行后");
        return proceed;
    }
}