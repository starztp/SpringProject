package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//实现页面跳转的Controller
@Controller
@RequestMapping("/page")
public class PageController {

    //参数为jsp页面名称
    @RequestMapping("/{pagename}")
    public String go(@PathVariable String pagename){
        return pagename;
    }

}
