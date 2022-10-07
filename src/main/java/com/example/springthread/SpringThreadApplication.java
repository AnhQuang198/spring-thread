package com.example.springthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringThreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringThreadApplication.class, args);
    }

}
