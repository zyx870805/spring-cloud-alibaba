package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsoleMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/META-INF/spring/consumer.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println(userService.getNameById("111"));
    }
}
