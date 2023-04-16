package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout1() {
        return "Swim 1000 meters as a warm up";
    }
}
