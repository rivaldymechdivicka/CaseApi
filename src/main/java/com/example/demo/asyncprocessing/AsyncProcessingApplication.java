package com.example.demo.asyncprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncProcessingApplication {
    public static void main(String[] args) {
        SpringApplication.run(AsyncProcessingApplication.class, args);
    }
}
