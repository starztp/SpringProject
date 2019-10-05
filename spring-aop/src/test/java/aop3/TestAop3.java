package aop3;

import com.tianyou.aop.aop3.Impl.UserServiceImpl;
import com.tianyou.aop.aop3.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop3 {

    @Test
    public void TestAopConfig2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop3/spring.xml");
        UserService userService=context.getBean("userserviceImpl",UserService.class);
        userService.login("aaa","sss");
    }
}
