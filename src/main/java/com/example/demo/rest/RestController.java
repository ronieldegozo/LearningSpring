package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/rouge")
    public String helloWorld(){
        return "Hello World! Rougeniel";
    }

    ///exposed endpoint
    @GetMapping("/codinglife")
    public String getDailyTask(){
        return "Coding is Life";
    }

    ///exposed endpoint
    @GetMapping("/health")
    public String getHealth(){
        return "Coding is Life";
    }
}
