package com.rhslearnings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhslearnings.model.MessageRequestDetails;
import com.rhslearnings.model.MessageResponse;
import com.rhslearnings.service.MyDatabaseService;


@RestController
@RequestMapping("mongo/messages")
public class MessageController {
	
	@Autowired MyDatabaseService databaseService;
	
	@PostMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	
	public MessageResponse createMessage(@RequestBody MessageRequestDetails messageRequestDetails)  {
		
		MessageResponse response = databaseService.save(messageRequestDetails);
		
		return response;
		
	}

}
