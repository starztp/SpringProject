package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/path")//表示该Controller只映射到/path的url
public class PathController {

    @RequestMapping("/showlogin")
    public String showlogin(){
        return "login";
    }

    @RequestMapping("/forwardlogin")
    public String forwardlogin(){
        //不加“/”表示相对路径，从方法所在位置找showlogin
        return "forward:showlogin";
        //加“/”表示绝对路径，项目所在位置找showlogin
        //return "forward:/showlogin";
    }

    //rest风格url
    //method表示限定请求方式
    //@RequestMapping(path = "/rest/{id}",method = RequestMethod.POST)
    @PostMapping("/rest/{id}")//表示必须使用Post请求来访问，同上面的RequestMapping注解
    public String testpostrest(@PathVariable String id){//PathVariable表示参数值来源于url
        return "hello";
    }

   // @RequestMapping(path = "/rest/{id}",method = RequestMethod.GET)
    @GetMapping("/rest/{id}")//表示必须使用Get请求来访问，同上面的RequestMapping注解
    public String testgetrest(String id){
        return "hello";
    }

    //表示必须要有id这个参数，name必须等于tianyou,password不等于123才能访问
    @RequestMapping(path = "/param",params = {"id","name=tianyou","password!=123"})
    public String testparam(){
        return "login";
    }

    //表示请求头里必须要有cookie才能访问
    @RequestMapping(path = "/header",headers = {"Cooike"})
    public String testheader(){
        return "hello";
    }
}
