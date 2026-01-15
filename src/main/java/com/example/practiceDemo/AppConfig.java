package com.example.practiceDemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @PostConstruct
    public void  postConfig(){
        System.out.println("Before Initialization.......");

    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("After destroying bean.....");
    }


}
