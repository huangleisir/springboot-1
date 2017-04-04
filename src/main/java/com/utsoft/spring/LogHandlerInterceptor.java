package com.utsoft.spring;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <br />日期：2017/4/4
 * <br />时间：16:50
 * <br />创建人：刘坤
 * <br />描述：
 * springBoot 拦截器
 */
public class LogHandlerInterceptor implements HandlerInterceptor {
    // 这几个方法、就是在请求 前 中 后  执行的。
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=======preHandle===========================" + handler.getClass());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("========postHandle==========================");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) throws Exception {
        System.out.println("=========afterCompletion=========================");
    }
}
