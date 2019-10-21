package Controller;

import Util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

@Controller
@RequestMapping("/file")
public class FileController {


    @RequestMapping("/upload")
    public String upload(@RequestParam CommonsMultipartFile file, HttpSession session){//表示从请求参数中获取参数，平时可以省去该注解，但是CommonsMultipartFile对象必须要有该注解
        System.out.println("FileController.upload");
        System.out.println("表单名称:"+file.getName());
        System.out.println("文件名:"+file.getOriginalFilename());

        //获取上传目录的物理路径
        String realpath=session.getServletContext().getRealPath("/WEB-INF/upload/");
        System.out.println(realpath);
        //将上传的文件转存
        try {
            file.transferTo(new File(realpath,file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/download")
    public void download(String filename, HttpSession session, HttpServletResponse response) throws IOException {
        String realpath=session.getServletContext().getRealPath("/WEB-INF/upload/");
        File file=new File(realpath,filename);
        //将utf-8编码转义为浏览器编码，这样下载文件就支持中文名称了
        filename=new String(filename.getBytes("utf-8"),"iso8859-1");
        //设置响应数据用下载的方式获取,并指定下载文件名
        response.setHeader("content-disposition","attachment;filename="+filename);
        //将文件输入流copy到输出流中
        StreamUtils.copy(new FileInputStream(file),response.getOutputStream());
    }
}
