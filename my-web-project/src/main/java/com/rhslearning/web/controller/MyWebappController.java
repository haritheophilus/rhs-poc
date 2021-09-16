package com.rhslearning.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = "/ui")
public class MyWebappController {
	
	@Autowired
	RestTemplate restTemplate;
	
@RequestMapping("/")
	public String welcome(HttpServletRequest request,String message) {
		
		if(message != null) {
		String messageId =	restTemplate.postForObject("http://PERSIST-MSG-SERVICE/msgsrv/", message, String.class);
		request.setAttribute("messageId", messageId);
		request.setAttribute("message", message);
		
		restTemplate.getForObject("http://PUBLISH-MSG-SERVICE/kafka/publish?message="+ message,String.class);
		
		}
		return "welcome";
	}
	
}
