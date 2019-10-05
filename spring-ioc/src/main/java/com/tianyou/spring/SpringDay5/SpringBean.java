package com.tianyou.spring.SpringDay5;

public class SpringBean {

    private String name;
    private String gender;

    {
        System.out.println("执行代码块");
    }

    public SpringBean(){
        System.out.println("执行构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void init(){
        this.name=this.name.toUpperCase()+this.gender;
    }

    //在执行context.destroy()前会执行该方法
    public void destory(){
        System.out.println("执行destory");
    }

}
