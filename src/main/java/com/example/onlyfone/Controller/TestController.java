package com.example.onlyfone.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    // API trả về JSON
    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Hello World from Spring Boot!");
    }
}

// Class Message
class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
