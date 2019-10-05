package com.tianyou.Dao.Impl;

import com.tianyou.Dao.UserDao;
import com.tianyou.Entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * mybatis整合spring的dao接口实现类，一般不会写
 */
@Repository
public class UserDaoMybatisImpl implements UserDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public User finduserbyId(int id) {
        return null;
    }

    @Override
    public User finduserbyName(String name) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        return  userDao.finduserbyName(name);
    }

    @Override
    public void addUser(User user) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        userDao.addUser(user);
    }
}
