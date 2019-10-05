package com.tianyou.aop.aop2.Impl;

import com.tianyou.aop.aop2.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void login(String username, String password) {

    }

    @Override
    public String signout() {
        return "byebye";
    }
}
