package aop2;

import com.tianyou.aop.aop2.Impl.UserServiceImpl;
import com.tianyou.aop.aop2.UserService;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestAop2 {

    /**
     * jdk动态代理
     */
    @Test
    public void TestjdkProxy(){
        /**
         * 调用Proxy的newProxyInstance方法动态生成代理类和实例
         * newProxyInstance的3个参数分别表示：
         * 1.目标类的类加载器
         * 2.目标类实现的接口
         * 3.交叉业务逻辑
         */
        final UserService userService=(UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),new Class[]{UserService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //1.打印日志
                System.out.println(method.getName());
                //2.执行业务
                Object invokeresult=method.invoke(new UserServiceImpl(),args);
                return invokeresult;
            }
        });
        userService.login("sss","aaa");
        userService.signout();
        System.out.println(userService.signout());
        System.out.println(userService.getClass());//userservice对象的类型
    }

    /**
     * CGLIB动态代理
     */
    @Test
    public void TestCGLIBProxy(){
        /**
         * 调用Enhancer的create方法动态生成代理类和实例
         * newProxyInstance的3个参数分别表示：
         * 1.目标类的类类型
         * 2.交叉业务逻辑
         */
        UserService userService=(UserService) Enhancer.create(UserServiceImpl.class, new net.sf.cglib.proxy.InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                //打印日志
                System.out.println(method.getName());
                //业务逻辑
               return  method.invoke(new UserServiceImpl(),objects);
            }
        });
        userService.login("aaa","sss");
        userService.signout();
        System.out.println(userService.getClass());
    }


    @Test
    public void TestAopConfig1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("aop2/spring.xml");
        UserService userService=context.getBean("userserviceProxy",UserService.class);
        System.out.println(userService.getClass());
        userService.login("aaa","ass");
        userService.signout();
    }
}
