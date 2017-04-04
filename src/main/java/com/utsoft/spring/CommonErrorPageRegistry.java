package com.utsoft.spring;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

/**
 * <br />日期：2017/4/4
 * <br />时间：17:23
 * <br />创建人：刘坤
 * <br />描述：
 * Controller 出错了、跳转自定义的页面去。
 */
//@Component
public class CommonErrorPageRegistry implements ErrorPageRegistrar {


    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        // 404错误、就跳转到这个页面去。
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND,"/error404.html");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error500.html");
        ErrorPage error01 = new ErrorPage(IllegalAccessException.class,"/error1.html");
        registry.addErrorPages(e404,e500,error01);
    }
}
