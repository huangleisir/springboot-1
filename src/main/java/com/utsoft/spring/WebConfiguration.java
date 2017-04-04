package com.utsoft.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * <br />日期：2017/4/4
 * <br />时间：16:55
 * <br />创建人：刘坤
 * <br />描述：
 * 拦截器、必须与它配置。一起使用的。
 *
 *
 *
 *
 *   拦截器的使用步骤
 *   1：写一个拦截器，实现HandlerInterceptor接口
 *   2：写一个类，集成WebMvcConfigurerAdapter抽象类，然后重写addInterceptors方法，并调用registry.addInterceptor把上一步的拦截器加进去
 *
 *   HandlerInterceptor
 *   preHandle：controller执行之前调用
 *   postHandle：controller执行之后，且页面渲染之前调用
 *   afterCompletion：页面渲染之后调用，一般用于资源清理操作
 *
 *   异常处理
 *   如何去掉spring boot默认的异常处理逻辑
 *   @SpringBootApplication(exclude=ErrorMvcAutoConfiguration.class)
 *
 *   使用ErrorPageRegistrar方法
 *   写一个类，实现ErrorPageRegistrar接口，然后实现registerErrorPages方法，在该方法里面，添加具体的错误处理逻辑(类似web.xml里面配置错误处理方式)
 *
 *   全局异常处理步骤
 *   1：写一个类，需要加上@ControllerAdvice注解
 *   2：写一个异常处理方法，方法上面需要加上@ExceptionHandler(value=Exception.class)这个注解，在该方法里面处理异常
 *
 *
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 把你的写的哪个拦截器、给加进去。
        registry.addInterceptor(new LogHandlerInterceptor());
    }
}
