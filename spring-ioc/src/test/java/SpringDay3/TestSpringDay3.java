package SpringDay3;

import com.tianyou.spring.SpringDay3.service.Impl.UserServiceImpl;
import com.tianyou.spring.SpringDay3.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDay3 {

    @Test
    public void TestService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay3/spring.xml");
        UserService service=context.getBean("userservice",UserServiceImpl.class);
        boolean flag=service.login("tianyou","111");
        if(flag){
            System.out.println("success");
        }
    }
}
