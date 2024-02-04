package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

////Importing directory on the Project
//@SpringBootApplication(scanBasePackages = {
//		"com.example.util",
//		"com.example.demo"
//})

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
