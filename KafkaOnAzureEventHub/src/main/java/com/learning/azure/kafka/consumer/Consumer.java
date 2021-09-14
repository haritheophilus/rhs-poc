package com.learning.azure.kafka.consumer;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.learning.azure.kafka.service.AzureTestClient;


@Service
public class Consumer {


    @Autowired
    private AzureTestClient azureClient;

	
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);


   // @KafkaListener(topics = {"rules.new", "rules.new1"}, groupId = "multiple-group")
    @KafkaListener(topics = {"rules.new"}, groupId = "${spring.kafka.consumer.group-id}" )
    public void consume(@Payload String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topicName) throws IOException{
        logger.info("<<<Consuming<<< {}", message);
       
        azureClient.uploadFileToBlobStorage(topicName, message);
    }
   
}
