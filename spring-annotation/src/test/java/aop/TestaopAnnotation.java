package aop;

import com.tianyou.aop.Impl.UserServiceImpl;
import com.tianyou.aop.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestaopAnnotation {

    @Test
    public void TestAdvice(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop/spring.xml");
        UserService userService=context.getBean("userserviceimpl",UserService.class);
        userService.login("aaa","sss");
        userService.signout();

    }
}
