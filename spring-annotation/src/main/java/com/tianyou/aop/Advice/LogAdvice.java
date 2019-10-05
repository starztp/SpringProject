package com.tianyou.aop.Advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component(value = "logadvice")
@Aspect//表示这是一个增强类
public class LogAdvice {

    //定义切入点表达式
    @Pointcut("execution(* com.tianyou.aop.Impl.UserServiceImpl.*(..))")
    public void pointcut(){

    }

    //前置通知
    @Before("pointcut()")
    public void beforemethod(JoinPoint joinPoint){
        Signature signature=joinPoint.getSignature();
        String methodname=signature.getName();
        Object[] args=joinPoint.getArgs();
        Object target=joinPoint.getTarget();
        System.out.println("方法执行前......................");
        System.out.println("方法名称:"+methodname);
        System.out.println("方法参数:"+ Arrays.toString(args));
        System.out.println("目标对象:"+target);
    }

    //后置通知
    @AfterReturning(value = "pointcut()",returning = "returnvalue")//pointcut后面的()不能省略
    public void aftermethod(JoinPoint joinPoint,Object returnvalue){
        Signature signature=joinPoint.getSignature();
        String methodname=signature.getName();
        Object[] args=joinPoint.getArgs();
        Object target=joinPoint.getTarget();
        System.out.println("方法执行后......................");
        System.out.println("方法名称:"+methodname);
        System.out.println("方法参数:"+ Arrays.toString(args));
        System.out.println("目标对象:"+target);
        System.out.println("方法返回值:"+returnvalue);
    }

    //异常通知
    @AfterThrowing(value = "pointcut()",throwing = "e")
    public void exceptionadvice(JoinPoint joinPoint,Exception e){
        System.out.println("异常通知执行。。。。。。。。。");
        System.out.println("异常："+e);
    }

    //环绕通知
    @Around("pointcut()")
    public void aroundadvice(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知方法执行前。。。。。。。。。。。。");
        try {
            joinPoint.proceed();//执行业务
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知方法执行后。。。。。。。。。。。。");
    }
}
