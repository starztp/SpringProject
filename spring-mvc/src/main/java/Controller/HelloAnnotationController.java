package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 基于注解实现Controller
 */
@Controller
public class HelloAnnotationController {

    //指定访问url
    @RequestMapping("/hello")
    public ModelAndView sayhello(String name){
        ModelAndView modelAndView=new ModelAndView();
        //添加模型数据
        modelAndView.addObject("msg","注解Controller:"+name);
        //添加视图名字,不用写jsp后缀
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
