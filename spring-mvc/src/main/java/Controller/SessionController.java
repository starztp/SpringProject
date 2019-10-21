package Controller;

import Vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/session")
@SessionAttributes("userVo")//将userVo对象存到session中
public class SessionController {

    @RequestMapping("/step1")
    public String step1(){
        return "step1";
    }

    @RequestMapping("/step2")
    public String step2(UserVo userVo){
        System.out.println("SessionController.step2"+userVo);
        return "step2";
    }


    @RequestMapping("/step3")
    public String step3(UserVo userVo){
        System.out.println("SessionController.step3"+userVo);
        return "step3";
    }

    @RequestMapping("/regist")
    public String regist(UserVo userVo, HttpSession session){
        System.out.println("session.uservo:"+session.getAttribute("userVo"));
        System.out.println("SessionController.regist,"+userVo);
        return "success";
    }

}
