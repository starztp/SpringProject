package com.tianyou.aop.aop1.Proxy;

import com.tianyou.aop.aop1.Impl.UserServiceImpl;
import com.tianyou.aop.aop1.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 代理类三要素
 * 1.目标类的接口
 * 2.目标类的实例
 * 3.交叉业务逻辑，要执行的操作
 */
public class UserServiceProxy implements UserService {

    private UserService userService=new UserServiceImpl();

    @Override
    public void login(String username, String password) {
        //System.out.println("开始登陆");
        //userService.login(username,password);
        try {
            Method method=userService.getClass().getMethod("login", String.class, String.class);
            invoke(method,username,password);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String signout() {
       // System.out.println("登出....");
        //return userService.signout();
        try {
            Method method=userService.getClass().getMethod("signout");
            return invoke(method).toString();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 封装到公共方法中，统一入口，模块化
     * @param method
     * @param args
     * @return
     */
    private Object invoke(Method method,Object...args){
        //打印日志
        System.out.println(method.getName());

        //执行业务
        try {
            return method.invoke(userService,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
