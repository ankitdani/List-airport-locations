package com.project.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.project.spring_project.LocationController"})
public class SpringProjectApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringProjectApplication.class, args);
	}

}
