package com.mycodexapp.springboot.demo.mycodexapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //injection properties for
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name is " + coachName + ", Team Name is "+ teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }
    @GetMapping("/work")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }
}
