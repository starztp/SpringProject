package Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 基于实现接口的Controller
 */
public class HelloController implements Controller {
    /**
     * 处理请求
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name=request.getParameter("name");
        ModelAndView modelAndView=new ModelAndView();
        //添加模型数据
        modelAndView.addObject("msg","hello:"+name);
        //添加视图名字,不用写jsp后缀
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
