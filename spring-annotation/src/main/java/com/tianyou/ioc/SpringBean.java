package com.tianyou.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "springbean")
public class SpringBean {

    /**
     * 自动注入，寻找匹配的OtherBean类型自动注入值
     */
    @Autowired
    private OtherBean otherBean;

    @Override
    public String toString() {
        return "SpringBean{" +
                "otherBean=" + otherBean +
                '}';
    }

    //相当于destroy-method=""
    @PostConstruct
    public void init(){
        System.out.println("初始化执行");
    }


    //相当于init-method=""
    @PreDestroy
    public void destroy(){
        System.out.println("销毁Bean时执行");
    }
}
