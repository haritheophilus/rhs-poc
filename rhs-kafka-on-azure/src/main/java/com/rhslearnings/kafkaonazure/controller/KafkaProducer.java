package com.rhslearnings.kafkaonazure.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.rhslearnings.kafkaonazure.model.RequestModel;


@Service
public class KafkaProducer {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

	@Autowired
	private  KafkaTemplate<String, RequestModel> kafkaTemplate;
	@Value("${topic.name}")
	private String topic;

	public void send(RequestModel requestModel) {
		logger.info("------------>> Produced message in JSON ---------------------------->>>>");
		logger.info(requestModel.getInvoiceId());
		kafkaTemplate.send(topic, requestModel);
	}
}
