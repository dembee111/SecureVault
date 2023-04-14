

package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout1() {
        return "Practice your backhand yolley!";
    }
}
