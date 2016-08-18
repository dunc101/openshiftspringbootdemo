package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftspringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftspringbootdemoApplication.class, args);
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "pong";
	}
}
