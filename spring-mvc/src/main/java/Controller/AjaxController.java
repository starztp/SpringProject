package Controller;

import com.sun.deploy.net.HttpResponse;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/ajax")
public class AjaxController {


    @RequestMapping("/test1")
    public void test1(HttpServletResponse response) throws IOException {
        response.getWriter().write("success");
    }

    @RequestMapping("/test2")
    @ResponseBody//表示将方法的返回值传入响应结果中,并不是响应success2视图
    public String test2(){
        return "success2";
    }

    @RequestMapping("/getuser")
    @ResponseBody
    public User getUser(){
        return new User("tianyou","aaa","111","333@qq.com",18,null);
    }
}
