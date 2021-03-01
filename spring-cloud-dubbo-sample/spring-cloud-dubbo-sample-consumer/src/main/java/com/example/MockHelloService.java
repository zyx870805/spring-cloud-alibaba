package com.example;

public class MockHelloService implements IHelloService{
    @Override
    public String sayHello(String name) {
        return "sorry, 服务无法访问，返回降级数据";
    }
}
