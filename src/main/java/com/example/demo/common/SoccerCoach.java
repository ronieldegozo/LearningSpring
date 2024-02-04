package com.example.demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SoccerCoach implements  Coach{
    public SoccerCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Run for 20 mins, so can run fast!";
    }
}
