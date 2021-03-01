package com.example;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class HelloServiceImpl implements IHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String nickName) {
        return "are you ok? " + nickName + serviceName;
    }
}
