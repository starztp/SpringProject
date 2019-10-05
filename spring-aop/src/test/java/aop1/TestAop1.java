package aop1;

import com.tianyou.aop.aop1.Proxy.UserServiceProxy;
import org.junit.Test;

public class TestAop1 {

    @Test
    public void Testproxy(){
        UserServiceProxy proxy=new UserServiceProxy();
        proxy.login("aa","sss");
        proxy.signout();
    }
}
