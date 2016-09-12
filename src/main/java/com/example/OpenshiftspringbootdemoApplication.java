package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.Config;

@SpringBootApplication
@RestController
public class OpenshiftspringbootdemoApplication {

	@Autowired
	Config config;
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftspringbootdemoApplication.class, args);
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return config.getName();
	}
}
