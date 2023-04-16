package com.mycodexapp.springboot.demo.mycodexapp.common;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout1() {
        return "Practice fast bowling for 15 mintues";
    }
}
