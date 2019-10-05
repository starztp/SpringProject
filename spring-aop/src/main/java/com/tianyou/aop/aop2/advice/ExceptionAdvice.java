package com.tianyou.aop.aop2.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知
 * afterThrowing方法可以有多个，针对不同的异常
 */
public class ExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e){
        System.out.println("Exception:"+e);
    }

    public void afterThrowing(NullPointerException e){
        System.out.println("NullPointerException:"+e);
    }
}
