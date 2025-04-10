package com.jujcgu.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    MyFirstClass myFirstBean() {
        return new MyFirstClass("First Bean");
    }

    @Bean
    MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }
    
    @Bean
    @Primary
    MyFirstClass myThirdBean() {
        return new MyFirstClass("Third Bean");
    }

}
