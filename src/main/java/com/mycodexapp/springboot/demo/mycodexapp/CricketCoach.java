package com.mycodexapp.springboot.demo.mycodexapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout1() {
        return "Practice fast bowling for 15 mintues";
    }
}
