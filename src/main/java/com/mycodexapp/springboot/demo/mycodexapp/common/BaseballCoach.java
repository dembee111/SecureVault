package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout1() {
        return "Spent 30 minutes in best practices";
    }
}
