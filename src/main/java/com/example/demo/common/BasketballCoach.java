package com.example.demo.common;


import org.springframework.stereotype.Component;

@Component
public class BasketballCoach  implements  Coach{
    @Override
    public String getDailyWorkOut() {
        return "Have a push up for 10 mins";
    }
}
