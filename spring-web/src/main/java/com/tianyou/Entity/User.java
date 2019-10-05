package com.tianyou.Entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component(value = "user")
public class User implements Serializable {

    private int id;
    private String username;
    private String password;

    public User(){

    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
