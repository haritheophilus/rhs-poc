package com.rhslearnings.hwservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HwserviceApplication  { //for WAR package: extends SpringBootServletInitializer

	public static void main(String[] args) {
		SpringApplication.run(HwserviceApplication.class, args);
	}

}
