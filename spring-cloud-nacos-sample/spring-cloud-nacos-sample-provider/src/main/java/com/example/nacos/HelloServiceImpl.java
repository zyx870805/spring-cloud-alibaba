package com.example.nacos;

import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "hello world: " + name;
    }
}
