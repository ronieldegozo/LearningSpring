package com.example.demo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketballCoach  implements  Coach{

    public BasketballCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Have a push up for 10 mins";
    }
}
