package com.tianyou.Dao;

import com.tianyou.Entity.User;

public interface UserDao {

    public User finduserbyId(int id);

    public User finduserbyName(String name);

    //返回新增user的主键Id
    public void addUser(User user);
}
