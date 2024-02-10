package com.example.demo.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In constructor swim: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Swim 20 mins for a warm up!";
    }
}
