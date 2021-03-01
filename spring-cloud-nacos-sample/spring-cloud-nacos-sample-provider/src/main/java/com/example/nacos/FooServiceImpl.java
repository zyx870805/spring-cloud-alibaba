package com.example.nacos;

import org.apache.dubbo.config.annotation.Service;

@Service
public class FooServiceImpl implements IFooService{
    @Override
    public String foo(String name) {
        return "are you foo ? " + name;
    }
}
