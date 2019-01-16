package com.talent.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guobing
 * @Title: MyExceptionHandler
 * @ProjectName spring-boot-06-jdbc
 * @Description: 自定义exception异常处理
 * @date 2019/1/16下午2:19
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(UserException.class)
    public String handlerException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        /**
         *  查看Spring Boot源码，自定义异常处理必须设置状态码
         *  @<code>
         *      Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
         *  </code>
         */
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        request.setAttribute("ext", map);
        // 转发到/error请求
        return "forward:/error";
    }
}
