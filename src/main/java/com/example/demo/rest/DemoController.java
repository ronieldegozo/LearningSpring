package com.example.demo.rest;


import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    //define private field for dependency
    private Coach myCoach;

    //Setter Injection
    @Autowired
    public void setCoach(@Qualifier("swimCoach") Coach coach){
        System.out.println("In Constructor Controller: " + getClass().getSimpleName());
        myCoach = coach;
    }

    //define constructor
//    @Autowired
//    public DemoController (Coach coach){
//        myCoach = coach;
//    }

    @GetMapping("/dailywork")
    public String getDailyWork(){
        return myCoach.getDailyWorkOut();
    }

}
