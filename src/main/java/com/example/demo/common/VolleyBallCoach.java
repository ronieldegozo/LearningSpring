package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class VolleyBallCoach  implements Coach{

    public VolleyBallCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //Define init method
    @PostConstruct
    public void testPostConstruct(){
        System.out.println("In Testing for PostContruct: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void testPreDestroy(){
        System.out.println("In Testing for PreDestroy: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkOut() {
        return "Jump for 1 hr, so you can jump High!";
    }
}
