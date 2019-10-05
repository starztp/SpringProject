package com.tianyou.Controller;

import com.tianyou.Entity.User;
import com.tianyou.Service.Impl.UserServiceImpl;
import com.tianyou.Service.UserService;
import com.tianyou.Util.SpringBeanHolder;
import com.tianyou.Vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
servlet不能交给IOC容器进行管理，否则就不能接受和处理请求了
 */

@WebServlet("*.user")
public class webservlet extends HttpServlet {

    private UserService userService;

    //跳转至登录或注册页面
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path=req.getServletPath();
        if("/login.user".equals(path)){
            req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
        }else if("/regist.user".equals(path)){
            req.getRequestDispatcher("/WEB-INF/view/regist.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path=req.getServletPath();
        if("/login.user".equals(path)){
            login(req,resp);
        }else if("/regist.user".equals(path)){
            regist(req,resp);
        }

    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        userService=(UserService) SpringBeanHolder.getBean("userservice",UserService.class);
        User user=userService.login(username,password);
        if(user!=null){
            //登录成功后将用户信息放入session
            req.getSession().setAttribute("user",user);
            //页面跳转
            req.getRequestDispatcher("/WEB-INF/view/success.jsp").forward(req,resp);
        }else {
            req.setAttribute("loginError","用户名或密码错误");
            //重新回到登录页面
            req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
        }
    }

    private void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String repassword=req.getParameter("repassword");
        //将从页面获取的数据封装成Vo,因为数据可能对应数据库中多张表
        UserVo userVo=new UserVo(username,password,repassword);
        userService=(UserService) SpringBeanHolder.getBean("userservice",UserServiceImpl.class);
        userService.regist(userVo);
        //注册成功后跳转登录页面
        req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req,resp);
    }
}
