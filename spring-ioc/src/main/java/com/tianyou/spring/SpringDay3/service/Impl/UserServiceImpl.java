package com.tianyou.spring.SpringDay3.service.Impl;

import com.tianyou.spring.SpringDay3.dao.Impl.UserDaoImpl;
import com.tianyou.spring.SpringDay3.dao.UserDao;
import com.tianyou.spring.SpringDay3.entity.User;
import com.tianyou.spring.SpringDay3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String username, String password) {
        User user;

        if(username!=null&&!username.equals("")){
            user=userDao.findUserbyusername(username);
        }else {
            System.out.println("用户名不合法");
            return false;
        }
        if(password!=null&&!password.equals("")){
            return  user.getPassword().equals(password);
        }else {
            System.out.println("用户名和密码不符");
        }
        return false;
    }
}
