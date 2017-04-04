package com.utsoft.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;

// exclude = ErrorMvcAutoConfiguration.class 排除掉 springBoot 默认错误跳转。
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
