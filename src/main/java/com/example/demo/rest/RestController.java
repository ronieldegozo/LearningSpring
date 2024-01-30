package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/rouge")
    public String helloWorld(){
        return "Hello World! Rougeniel Love";
    }

    ///exposed endpoint
    @GetMapping("/codinglife")
    public String getDailyTask(){
        return "Coding is Life Forever";
    }

//    Injecting Configurable Properties
    @Value("${motor.brand}")
    private String MotorBrand;

    @Value("${rider.name}")
    private String MotorRider;

    //Expose Configurable Properties on the API
    @GetMapping("/motorcycle")
    public String getMotorBrand(){
        return "Motorcycle Brand : " + MotorBrand + " and Rider is " + MotorRider;
    }
}
