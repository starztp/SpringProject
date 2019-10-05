package Springday2;

import com.tianyou.spring.Springday2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDay2 {

    @Test
    public void TestSpringDay2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
    }
}
