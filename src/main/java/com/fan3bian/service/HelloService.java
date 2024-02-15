package com.fan3bian.service;

import org.springframework.stereotype.Service;

/**
 * @author zhangshuyi
 * @description
 * @create 2024/1/10 21:54
 */
@Service
public class HelloService {

    public String sayHello() {
        return "Hello";
    }
    public String sayHello(String name) {
        return "Hello: " + name;
    }
}
