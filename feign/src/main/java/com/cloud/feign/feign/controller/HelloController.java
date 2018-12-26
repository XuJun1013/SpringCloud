package com.cloud.feign.feign.controller;

import com.cloud.feign.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    public String sayHello(String name){
        System.out.println("xuuuuuuuuuuuuuuuuuuuuu"+name);
        return helloService.sayHello() + " " + name;
    }
}
