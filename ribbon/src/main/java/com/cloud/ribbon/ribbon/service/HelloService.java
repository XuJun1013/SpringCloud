package com.cloud.ribbon.ribbon.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "helloWorld";//提供一个helloWorld
    }
}
