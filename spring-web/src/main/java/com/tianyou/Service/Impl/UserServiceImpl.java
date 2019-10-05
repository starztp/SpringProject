package com.tianyou.Service.Impl;

import com.tianyou.Dao.UserDao;
import com.tianyou.Entity.User;
import com.tianyou.Service.UserService;
import com.tianyou.Vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.PasswordAuthentication;

@Service("userservice")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User login(String username, String password) {
        User user=new User();
        if(password.equals("")||password==null){
            user=null;
            System.out.println("密码不能为空");
        }

        if(!username.equals("")&&username!=null){
            user=userDao.finduserbyName(username);
            if (user!=null&&(user.getPassword().equals(password))){
                return user;
            }
           // throw new PasswordAuthentication("密码错误");
        }
        return null;
    }

    @Override
    public void regist(UserVo userVo) {
        //将传进来的userVo转为User实体对象
        User user=new User();
        user.setName(userVo.getUsername());
        user.setPassword(userVo.getRepassword());
        userDao.addUser(user);
        System.out.println("id:"+user.getId());

    }
}
