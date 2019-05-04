package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"com.example.controller","com.example.service","com.example.dao","com.example.model","com.example.demo"})
@EntityScan(basePackages="com.example.model")
public class Springbootdemo41Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo41Application.class, args);
	}

}
