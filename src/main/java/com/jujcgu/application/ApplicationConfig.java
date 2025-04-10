package com.jujcgu.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("bean1")
    MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }
    
    @Bean
    MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }

}
