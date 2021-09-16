package com.rhslearnings.hwservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloWorldController {
	
	//@GetMapping(value = "/greeting")
	public String wishHello() {
		
		return "Hello World";
	}

}
