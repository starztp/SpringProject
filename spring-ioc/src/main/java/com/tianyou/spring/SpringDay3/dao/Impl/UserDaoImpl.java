package com.tianyou.spring.SpringDay3.dao.Impl;

import com.tianyou.spring.SpringDay3.dao.UserDao;
import com.tianyou.spring.SpringDay3.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User findUserbyusername(String username) {
        System.out.println("根据username查找User");
        return null;
    }
}
