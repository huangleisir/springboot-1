package com.utsoft.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <br />日期：2017/4/4
 * <br />时间：19:02
 * <br />创建人：刘坤
 * <br />描述：
 * 处理全局异常的 类。
 */
@ControllerAdvice
public class GolbalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String errorHandler(Exception e){
        return "这个项目所有的异常都可以在这里面如何。来解决。" + e.getClass().getName();
    }

    // 也可以只能处理 全局的某一种异常。
}
