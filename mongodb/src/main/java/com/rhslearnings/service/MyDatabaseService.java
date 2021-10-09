package com.rhslearnings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rhslearnings.model.MessageRequestDetails;
import com.rhslearnings.model.MessageResponse;
import com.rhslearnings.model.Messages;


@Service
public class MyDatabaseService {
@Autowired
MessageRepository messageRepository;
@Autowired
SequenceGeneratorService sequenceGeneratorService;


	public MessageResponse save(MessageRequestDetails messageRequestDetails) {
		
		Messages entity = new Messages();
		entity.setId(Long.valueOf(sequenceGeneratorService.generateSequence(Messages.SEQUENCE_NAME)));
		entity.setContent(messageRequestDetails.getContent());
		entity.setTopicName(messageRequestDetails.getTopicName());
		
		messageRepository.save(entity);
		
		MessageResponse response = new MessageResponse();
		response.setContent(entity.getContent());
		response.setMsgId(String.valueOf(entity.getId()));
		response.setTopicName(entity.getTopicName());
		return response;
	}
}
