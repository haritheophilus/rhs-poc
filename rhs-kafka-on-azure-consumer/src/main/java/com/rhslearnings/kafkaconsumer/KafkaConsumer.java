package com.rhslearnings.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rhslearnings.kafkaonazure.model.RequestModel;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
    private  LocalProducer localProducer;


    @KafkaListener(topics = "${consumertopic.name}")
    public void receive(RequestModel model) {
        logger.info("Received message from kafka queue: {}", model.getAmount());
        
        if(model != null) {
        model.setAmount(model.getAmount() + 100);
        model.setItem("new:"+ model.getItem() );
        localProducer.send(model);
        }
    }
}
