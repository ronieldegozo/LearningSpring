package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach  implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Jump for 1 hr, so you can jump High!";
    }
}
