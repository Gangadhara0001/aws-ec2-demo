package com.gangadhara.aws_ec2_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello from AWS EC2!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Running";
    }

    @GetMapping("/name")
    public String name() {
        return "Gangadhara A B";
    }
}
