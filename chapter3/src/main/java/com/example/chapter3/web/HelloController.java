package com.example.chapter3.web;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloController {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Autowired
    RedissonClient redissonClient;

    @GetMapping("/hello")
    public String hello() throws IOException {
        redisTemplate.opsForValue().set("key", "value");

        return "hello world " + redissonClient.getConfig().toJSON();
    }
}
