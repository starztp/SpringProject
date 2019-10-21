package Interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 拦截器类
 */
public class HelloInterceptor implements HandlerInterceptor {

    /**
     * 目标业务方法执行前需要执行的逻辑
     * @param request
     * @param response
     * @param handler 参数handler本身就是HandlerMethod的实例
     * @return true表示继续调用后续的拦截器或目标处理方法，false表示不再调用
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler; //参数hander本质上就是HandlerMethod实例
            Object bean = handlerMethod.getBean();
            Method method = handlerMethod.getMethod();
            System.out.println("HelloInterceptor.preHandle,bean:" + bean.getClass() + ",method:" + method.getName() + ",args:" + Arrays.toString(method.getParameterTypes()));
        }
        return true;
    }

    /**
     * 目标方法执行后需要执行的逻辑，在方法执行完，渲染视图之前执行；可以对数据模型或视图进行修改
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("HelloInterceptor.postHandle");
    }

    /**
     * 在视图渲染之后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("HelloInterceptor.afterCompletion");
    }
}
