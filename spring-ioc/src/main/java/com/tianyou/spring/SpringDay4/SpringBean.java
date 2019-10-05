package com.tianyou.spring.SpringDay4;

import java.util.*;

public class SpringBean {

    private String name;
    private int age;
    private Double price;
    private Class clazz;
    private OtherBean otherBean;
    private int[] array;
    private List<OtherBean> list;
    private Set<OtherBean> set;
    private Map<OtherBean,Class> map;
    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public List<OtherBean> getList() {
        return list;
    }

    public void setList(List<OtherBean> list) {
        this.list = list;
    }

    public Set<OtherBean> getSet() {
        return set;
    }

    public void setSet(Set<OtherBean> set) {
        this.set = set;
    }

    public Map<OtherBean, Class> getMap() {
        return map;
    }

    public void setMap(Map<OtherBean, Class> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", clazz=" + clazz +
                ", otherBean=" + otherBean +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
