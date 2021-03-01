package com.example.nacos.web;

import com.example.nacos.IFooService;
import com.example.nacos.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private IHelloService helloService;

    @Reference
    private IFooService fooService;

    @GetMapping("/say")
    public String sayHello() {
       return helloService.sayHello("zw");
    }

    @GetMapping("/foo")
    public String foo() {
        return fooService.foo("zw");
    }
}
