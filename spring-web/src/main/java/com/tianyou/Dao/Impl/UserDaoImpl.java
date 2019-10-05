package com.tianyou.Dao.Impl;

import com.tianyou.Dao.UserDao;
import com.tianyou.Entity.User;
import com.tianyou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

//@Repository(value = "userdao")
public class UserDaoImpl{
/**
    @Autowired
    private JdbcTemplate template;

    @Override
    public User finduserbyId(int id) {
        String sql="select id,username,password from project_user where id=?";
        //返回集合对象
        List users=template.query(sql,new Object[]{id},new UserMapper());
        //返回单个对象
        User user=template.queryForObject(sql,new Object[]{id},new UserMapper());
        return user;
    }

    @Override
    public User finduserbyName(String name) {
        String sql="select id,username,password from project_user where username=?";
        User user=template.queryForObject(sql,new Object[]{name},new UserMapper());
        return user;
    }

    //返回新增用户的主键Id
    @Override
    public void addUser(final User user) {//匿名内部类中只能调用final变量
        KeyHolder keyHolder=new GeneratedKeyHolder();
        //新增信息时，主键会存入keyHolder
        template.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                String sql="insert into project_user(username,password) values (?,?)";
                //入参是sql和主键
                PreparedStatement statement=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                //给Sql中的占位符赋值
                statement.setString(1,user.getName());
                statement.setString(2,user.getPassword());
                return statement;
            }
        },keyHolder);
       // return keyHolder.getKey().intValue();
    }
 **/
}
