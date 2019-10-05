package ioc;

import com.tianyou.ioc.Controller.UserController;
import com.tianyou.ioc.Dao.Impl.UserDaoImpl;
import com.tianyou.ioc.Service.Impl.UserServiceImpl;
import com.tianyou.ioc.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOCAnnoation {

    @Test
    public void getbeanfromxml(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc/spring.xml");
        SpringBean springbean=context.getBean("springbean",SpringBean.class);
        System.out.println(springbean);
    }

    //测试获取@Controller注解对象
    @Test
    public void TestControllerBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc/spring.xml");
        UserController controller=context.getBean("usercontroller",UserController.class);
        System.out.println(controller);
    }

    //测试获取@Service注解对象
    @Test
    public void TestServiceBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc/spring.xml");
        UserServiceImpl service=context.getBean("userserviceimpl",UserServiceImpl.class);
        System.out.println(service);
    }

    //测试获取@Repository注解的Dao对象
    @Test
    public void TestDaoBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ioc/spring.xml");
        UserDaoImpl dao=context.getBean("userdaoimpl",UserDaoImpl.class);
        System.out.println(dao);
    }



}
