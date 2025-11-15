package com.example.onlyfone.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! This is my first Spring Boot application.";
    }
}
