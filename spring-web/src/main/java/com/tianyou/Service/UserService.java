package com.tianyou.Service;

import com.tianyou.Entity.User;
import com.tianyou.Vo.UserVo;

public interface UserService {
    public User login(String username, String password);

    public void regist(UserVo userVo);
}
