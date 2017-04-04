package com.utsoft.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br />日期：2017/4/4
 * <br />时间：16:45
 * <br />创建人：刘坤
 * <br />描述：
 */
@RestController
public class UserController {
    /**
     * @return
     * 配置拦截器、在执行这个 xxxController 方法之前，会执行一个什么。
     * 然后在执行之后 又会执行一个什么。  之中好像也会执行一个什么的。
     * 注：重点是拦截器的配置问题。
     */
    @GetMapping("/user/home")
    public String home(){
        System.out.println("-----LOVE------");
        return "user home";
    }



    // springboot 异常处理。  访问它就会抛一个异常出来。500错误与 404 错误。
    @GetMapping("exception2")
    public String exception2() throws IllegalAccessException {
        throw new IllegalAccessException("springboot 异常处理。");
    }
    // 就要出错了、就跳转到自己定义的一个错误页面去。


    // 捕获 到这个错误时、就单独的跳转到一个错误页面的
    @GetMapping("exception2Ko")
    public String exception3() throws IllegalAccessException {
        throw new IllegalAccessException("kobe");
    }


    // 捕获空指针错误。
    @GetMapping("empty")
    public String empty(){
        throw new NullPointerException("null kobe");
    }
}
