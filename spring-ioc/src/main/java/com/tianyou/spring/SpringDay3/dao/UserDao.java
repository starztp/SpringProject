package com.tianyou.spring.SpringDay3.dao;

import com.tianyou.spring.SpringDay3.entity.User;

public interface UserDao {

    public User findUserbyusername(String username);
}
