package com.example;

import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements IUserService{
    @Override
    public String getNameById(String uid) {
        return "nick";
    }
}
