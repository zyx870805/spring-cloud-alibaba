package com.example.chapter3.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(GpCondition.class)
    public BeanClass beanClass() {
        return new BeanClass();
    }
}
