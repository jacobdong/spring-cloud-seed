package com.ifireye.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JacobDong
 * @date 2018/4/27 10:00
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class MonitorApplication {

    @RequestMapping("/hello")
    public String sayHi(){
        return "hello";
    }



    public static void main(String[] args) {
        SpringApplication.run(MonitorApplication.class);
    }
}
