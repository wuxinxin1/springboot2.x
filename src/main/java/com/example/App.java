package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
//@SpringBootApplication   //这个一个组合注解
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
