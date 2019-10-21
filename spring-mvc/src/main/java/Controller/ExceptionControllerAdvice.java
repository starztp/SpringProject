package Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//该注解表示异常处理类（通知）
public class ExceptionControllerAdvice {

    @ExceptionHandler(ArithmeticException.class)//异常处理器
    public String mathhandler(){
        return "error/math";
    }
}
