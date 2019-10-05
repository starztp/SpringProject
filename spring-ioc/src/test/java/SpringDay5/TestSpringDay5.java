package SpringDay5;

import com.tianyou.spring.SpringDay5.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDay5 {

    @Test
    public void TestInitandDestoryMethod(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringDay5/spring.xml");
        SpringBean bean=context.getBean("springBean",SpringBean.class);
        System.out.println(bean.getName());
        context.destroy();
    }
}
