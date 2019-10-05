package com.tianyou.spring.SpringDay7;

public class SpringBean {

    private String name;
    private String password;
    private String age;

    public SpringBean(){
        System.out.println("执行无参构造方法");
    }

    public SpringBean(String name,String password,String age){
        System.out.println("执行带参构造方法");
        this.name=name;
        this.password=password;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
