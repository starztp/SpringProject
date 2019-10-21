package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnValueController {

    /**
     * 返回字符串表示视图名称
     * @return
     */
    @RequestMapping("/login2")
    public String login(String username, String password, Model model){
        if("admin".equals(username)&&"123".equals(password)){
            //将数据存储在Model对象中
            model.addAttribute("username",username);
            model.addAttribute("password",password);
            return "success";
        }else{
            model.addAttribute("loginError","username or passoword is Illiagle");
            return "login";
            //加了forward表示转发到/login url上
           // return "forward:login";
            //加了redirect表示重定向到/login url上
            //return "redirect:login";
        }
    }
}
