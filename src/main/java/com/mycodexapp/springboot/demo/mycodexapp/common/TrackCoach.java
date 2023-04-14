package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout1() {
        return "Practice Track coach!!!!!!";
    }
}
