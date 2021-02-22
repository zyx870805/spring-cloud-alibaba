package com.example.chapter3.autoimport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoImport
public class ImportSelectorMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ImportSelectorMain.class, args);
        FirstClass firstClass = context.getBean(FirstClass.class);
        System.out.println(firstClass);
    }
}
