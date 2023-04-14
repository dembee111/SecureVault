package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout1() {
        return "Practice fast bowling for 15 mintues";
    }
}
