package com.qf.rl_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class RlWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RlWebApplication.class, args);
    }

}
