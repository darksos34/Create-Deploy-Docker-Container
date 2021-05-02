package com.springDockcontainer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/")
	public String home() {
		//getMessage will be printed in your command console
		System.out.println(getMessage());

		return "Hello Docker Builder, Keep on moving forward ";
	}
	@GetMapping
	public String getMessage(){
		return "<h1> Welcome to Docker Tutorial </h1";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
