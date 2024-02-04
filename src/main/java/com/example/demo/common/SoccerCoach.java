package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements  Coach{

    @Override
    public String getDailyWorkOut() {
        return "Run for 20 mins, so can run fast!";
    }
}
