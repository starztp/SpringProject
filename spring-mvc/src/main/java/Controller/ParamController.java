package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import java.io.*;
import java.util.Map;

@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * JavaEE组件
     * @param req
     * @param resp
     * @param session
     * @throws IOException
     */
    @RequestMapping("/testparam")
    public void testparam(HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws IOException {
        //从请求中获取参数值
        String username=req.getParameter("username");
        //将参数注入session
        session.setAttribute("username",username);

        //在页面上展示
        PrintWriter out=resp.getWriter();
        out.println("username:"+username);
        out.flush();
        out.close();
    }


    /**
     * IO字节流
     * @param is
     * @param os
     */
    @RequestMapping("/testIO")
    public void testIO(InputStream is, OutputStream os){
        //相当于如下代码
        // InputStream is=req.getInputStream();
        // OutputStream os=resp.getOutputStream();
        System.out.println("InputStream:"+is);
        System.out.println("OutputStream:"+os);
    }

    @RequestMapping("/testIO2")
    public void testIO2(Reader reader, Writer writer){
        //相当于如下代码
        //Reader reader=req.getReader();
        //Writer writer=resp.getWriter();
        System.out.println("Reader:"+reader);
        System.out.println("Writer:"+writer);
    }

    @RequestMapping("/setParamstoView")
    public String testsetParamstoView(Model model, Map map, ModelMap modelMap){
        model.addAttribute("name","tianyou");
        map.put("age",18);
        modelMap.addAttribute("gender","male");
        modelMap.put("address","123");
        return "result";
    }

    /**
     * String参数传递
     * @param username
     * @param age
     * @return
     */
    //将页面上传的name参数绑定username参数,defaultvalue表示如果不传age,默认值为18
    @RequestMapping("/testStringParam")
    public String testStringParam(@RequestParam(name = "name") String username,@RequestParam(defaultValue = "18",required = false) int age){
        System.out.println(username);
        return "result";
    }

    /**
     * 从请求头中获取参数
     * @param cookie
     * @return
     */
    @RequestMapping("/getfromheader")
    public String getfromheader(@RequestHeader(name = "Cookie") String cookie){
        System.out.println("cookie:"+cookie);
        return "result";
    }

    /**
     * 设置cookie
     * @param resp
     * @return
     */
    @RequestMapping("/setCookie")
    public String setCookie(HttpServletResponse resp){
        //向客户端添加cookie
        Cookie cookie=new Cookie("username","tianyou");
        //设置cookie的有效期为7天
        cookie.setMaxAge(7*24*60*60);
        resp.addCookie(cookie);
        return "result";
    }

    /**
     * 从cookie里获取参数
     * @param username
     * @return
     */
    @RequestMapping("/getparamfromcookie")
    public String getparamfromcookie(@CookieValue String username){
        System.out.println(username);
        return "result";
    }

    /**
     * 从requestbody中获取参数
     * @param requestbody
     * @return
     */
    @RequestMapping("/getfrombody")
     public String getfrombody(@RequestBody String requestbody){
        System.out.println(requestbody);
        return "result";
     }
}
