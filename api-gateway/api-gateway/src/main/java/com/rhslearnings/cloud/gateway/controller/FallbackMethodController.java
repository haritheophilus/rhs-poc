package com.rhslearnings.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class FallbackMethodController {
	
	@GetMapping("/uiServiceFallback")
	 @CircuitBreaker(name ="MY-UI-SERVICE" , fallbackMethod="uiFallback")
	public String uiFallback() {
		return "The UI Service is temporarily down. Please try after some time";
	}

}
