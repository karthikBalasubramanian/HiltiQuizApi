package com.hilti.quiz.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication
public class HiltiQuizApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiltiQuizApiApplication.class, args);
    }
}
