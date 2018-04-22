package com.ifireye.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JacobDong
 * @Date: 2018/4/21 18:03
 */
@SpringBootApplication
@RestController
public class Launcher {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
