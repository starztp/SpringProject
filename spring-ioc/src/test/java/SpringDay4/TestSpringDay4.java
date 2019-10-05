package SpringDay4;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.tianyou.spring.SpringDay4.SpringBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;



public class TestSpringDay4 {

    @Test
    public void TestClassPathXmlApplicationContextConfig(){
        ApplicationContext XMLcontext=new ClassPathXmlApplicationContext("SpringDay4/spring.xml");
        SpringBean springBean=XMLcontext.getBean("springBean",SpringBean.class);
        System.out.println(springBean);
    }


    @Test
    public void TestFileSystemXmlApplicationContextConfig(){
        ApplicationContext filecontext=new FileSystemXmlApplicationContext("E:/Myjobs/Java/SpringProject/springparent/spring-ioc/src/main/resources/SpringDay4/spring.xml");
        SpringBean springBean=filecontext.getBean("springBean",SpringBean.class);
        System.out.println(springBean);
    }


    /**
     * BeanFactory的形式已经过时，目前主流的Spring配置获取还是基于ApplicationContext来实现
     */
    @Test
    public void TestBeanfactory(){
        Resource resources=new ClassPathResource("SpringDay4/spring.xml"); //创建Resource对象
        BeanFactory factory= new XmlBeanFactory(resources);
        SpringBean springBean=factory.getBean("springBean", SpringBean.class);
        System.out.println("OtherBeanName:"+springBean.getOtherBean().getName());
    }

}
