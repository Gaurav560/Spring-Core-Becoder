package com.springboot.war.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootFirstApp1Application {

	@GetMapping("/Greeting")
	public String greeting() {
		return "Spring boot war demo";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstApp1Application.class, args);
	}

}
