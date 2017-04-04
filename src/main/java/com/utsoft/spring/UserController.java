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

}
