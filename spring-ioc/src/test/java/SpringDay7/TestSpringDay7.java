package SpringDay7;

import com.tianyou.spring.SpringDay7.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDay7 {

    /**
     * 测试无参构造方法实例化bean
     */
    @Test
    public void TestNoneParamConstractor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay7/spring.xml");
        SpringBean bean=context.getBean("springBean",SpringBean.class);
        System.out.println(bean);
    }

    /**
     * 使用带参构造方法实例化Bean
     */
    @Test
    public void TestParmConstractor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay7/spring.xml");
        SpringBean bean=context.getBean("springBean1",SpringBean.class);
        System.out.println(bean);
    }

    /**
     * 测试无参工厂方法注入bean
     */
    @Test
    public void TestNoneParamFactoryBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay7/spring.xml");
        SpringBean bean=context.getBean("springBean3",SpringBean.class);
        System.out.println(bean);
    }

    @Test
    public void TestParamFactoryBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringDay7/spring.xml");
        SpringBean bean=context.getBean("springBean4",SpringBean.class);
        System.out.println(bean);
    }
}
