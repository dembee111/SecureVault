

package com.mycodexapp.springboot.demo.mycodexapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout1() {
        return "Practice your backhand yolley!";
    }
}
