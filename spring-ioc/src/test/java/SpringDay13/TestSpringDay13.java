package SpringDay13;

import com.tianyou.spring.SpringDay13.DateFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

public class TestSpringDay13 {

    /**
     * 测试Calendar转Date对象
     */
    @Test
    public void TestCalendarToDate(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,2019);
        calendar.set(Calendar.MONTH,10);//这里的10表示是11月份
        calendar.set(Calendar.DAY_OF_MONTH,11);
        calendar.set(Calendar.HOUR_OF_DAY,12);
        calendar.set(Calendar.MINUTE,30);
        calendar.set(Calendar.SECOND,30);
        Date date=calendar.getTime();
        System.out.println(date);
    }


    /**
     * 通过DateFactoryBean的getObject方法获取Date对象
     */
    @Test
    public void getDateFromFactoryBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay13/spring.xml");
        Date date=context.getBean("double11",Date.class);
        System.out.println(date);
    }


    @Test
    public void TestFileSystemResource() throws IOException {
        Resource resource=new FileSystemResource("E:/Myjobs/Java/SpringProject/springparent/spring-ioc/src/main/resources/SpringDay13/spring.xml");
        String filename=resource.getFilename();
        String path=((FileSystemResource) resource).getPath();
        boolean exists=resource.exists();
        InputStream inputStream=resource.getInputStream();
        System.out.println("文件名"+filename);
        System.out.println("文件路径"+path);
        System.out.println("文件是否存在"+exists);
        System.out.println(resource.getFile());
        //StreamUtils.copy(inputStream,new FileOutputStream("e:/springcopy.xml"));
    }


    @Test public void TestClassPathResource() throws IOException {
        Resource resource=new ClassPathResource("SpringDay13/resource.txt");
        String filename=resource.getFilename();
        String path=((ClassPathResource) resource).getPath();
        boolean exists=resource.exists();
        InputStream inputStream=resource.getInputStream();
        System.out.println("文件名"+filename);
        System.out.println("文件路径"+path);
        System.out.println("文件是否存在"+exists);
        System.out.println(resource.getFile());
        StreamUtils.copy(inputStream,new FileOutputStream("e:/resource.xml"));
    }

}
