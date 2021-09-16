package com.rhslearnings.hwservice.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MyDatabaseService {
@Autowired
MessageRepository messageRepository;


	public String save(String msg) {
		
		MessageEntity entity = new MessageEntity();
		entity.setMessage(msg);
		
		messageRepository.save(entity);
		return String.valueOf(entity.getId());
	}
}
