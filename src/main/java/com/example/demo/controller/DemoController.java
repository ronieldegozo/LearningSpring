package com.example.demo.controller;


import com.example.demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    //define private field for dependency
    private Coach myCoach;

    //define constructor
    @Autowired
    public DemoController (Coach coach){
        myCoach = coach;
    }

    @GetMapping("/dailywork")
    public String getDailyWork(){
        return myCoach.getDailyWorkOut();
    }

}
