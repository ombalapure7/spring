package com.springboot.demo.myapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	// expose end point that returns "hello world"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello, the time on server is " +LocalDateTime.now();
	}
}
