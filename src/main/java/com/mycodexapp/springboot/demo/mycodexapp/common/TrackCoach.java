package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout1() {
        return "Practice Track coach!!!!!!";
    }
}
