package com.mycodexapp.springboot.demo.mycodexapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication (
//		scanBasePackages = {"com.mycodexapp.springboot",
//							"com.mycodexapp.util"})
@SpringBootApplication
public class MycodexappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycodexappApplication.class, args);
	}

}
