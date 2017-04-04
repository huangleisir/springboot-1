package com.utsoft.spring;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * <br />日期：2017/4/4
 * <br />时间：17:54
 * <br />创建人：刘坤
 * <br />描述：
 * springBoot 全局的一个异常捕获。
 */
@RestController
public class BookController {

    @GetMapping("/boot/list")
    public String list() throws FileNotFoundException {
        throw new FileNotFoundException("什么文件没有找到。");
    }

    @GetMapping("/boot/error02")
    public String error02() throws ClassNotFoundException {
        throw new ClassNotFoundException("一个什么类没有找到。");
    }


    // 一个异常处理的方法。
    // FileNotFoundException.class 只处理什么样式的异常。
    // Exception.class 所有的异常全部进这个 xxController 这个方法里面来。
    @ExceptionHandler(value = Exception.class)
    public String erro3(Exception e){
        return "只处理这个异常。" + e.getMessage();
    }
    // 它只能处理 当前 xxController 类里面的异常。


}
