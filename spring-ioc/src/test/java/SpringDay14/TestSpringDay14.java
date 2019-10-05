package SpringDay14;

import com.tianyou.spring.SpringDay14.SpringBean;
import com.tianyou.spring.SpringDay14.SpringBeanPostProcessor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDay14 {

    @Test
    public void TestBeanPostProcessor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay14/spring.xml");

    }
}
