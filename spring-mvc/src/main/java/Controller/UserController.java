package Controller;

import Vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * ModelAttribute将页面传的参数转化成自定义对象
     * Errors参数表示页面传递数据进来过程中出错的信息
     * @param userVo
     * @param errors
     * @return
     */
    @RequestMapping("/regist")
    public String regist(@ModelAttribute UserVo userVo, Errors errors){
        System.out.println("UserController.regist");
        //手动进行服务端数据校验，自定义errors
        if(userVo.getAge()>18){
            errors.reject("年龄过大，引起强烈不适");
        }

        if(errors.hasErrors()){
            System.out.println("errors:"+errors);
            return "regist";//出现报错即返回注册页面
        }
        System.out.println("userVo:"+userVo);
        return "success";
    }

    /**
     * 使用JSR303对方法参数进行校验，Valid注解加在要校验的对象前面
     * @param userVo
     * @param errors
     * @return
     */
    @RequestMapping("/regist1")
    public String regist1(@Valid UserVo userVo,Errors errors){
        System.out.println("UserController.regist1");
        if(errors.hasErrors()){
            System.out.println("errors:"+errors);
            return "regist";//出现报错即返回注册页面
        }
        System.out.println("userVo:"+userVo);
        return "success";
    }
    /**
     * ModelAttribute注解放在方法头上表示将该方法的返回值放进request作用域，ModelAttribute注解括号内的type就是该返回值key的名称
     * 在调用所在Controller所用方法前都会调用添加ModelAttribute注解的方法，并向模型中添加数据
     * @return
     */
    @ModelAttribute("types")
    public List<String> gettypes(){
        System.out.println("UserController.gettypes");
        List<String> list= Arrays.asList("服装","数码","食品");
        return list;
    }

    @RequestMapping("/result")
    public String getresult(){
        return "result";
    }
}
