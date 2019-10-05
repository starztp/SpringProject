package com.tianyou.spring.SpringDay7;

public class SpringBeanFactory {

    public SpringBean createSpringBean(){
        return new SpringBean();
    }

    public SpringBean createSpringBean(String name,String password,String age){
        return new SpringBean(name,password,age);
    }
}
