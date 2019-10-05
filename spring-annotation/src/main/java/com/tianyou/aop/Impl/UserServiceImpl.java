package com.tianyou.aop.Impl;

import com.tianyou.aop.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userserviceimpl")
public class UserServiceImpl implements UserService {
    @Override
    public void login(String username, String password) {

    }

    @Override
    public String signout() {
        return null;
    }
}
