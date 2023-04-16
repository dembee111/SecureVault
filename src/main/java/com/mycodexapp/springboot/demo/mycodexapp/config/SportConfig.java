package com.mycodexapp.springboot.demo.mycodexapp.config;

import com.mycodexapp.springboot.demo.mycodexapp.common.Coach;
import com.mycodexapp.springboot.demo.mycodexapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
