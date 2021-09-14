package com.learning.azure.kafka.producer;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

	public static final ArrayList<String> TOPIC_LIST = new ArrayList<>(Arrays.asList("rules.new"));
//, "rules.new1", "rules.new2", "rules.new3"
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		LOGGER.info(">>>>>PRODUCING>>>>>" + message);
		for (String TOPIC : TOPIC_LIST) {
			ProducerRecord<String, String> prd = new ProducerRecord<>(TOPIC, message + " ---- from Topic:----- "+TOPIC);
			prd.headers().add(TOPIC, "someHeader".getBytes());
			this.kafkaTemplate.send(prd);
		}
	}

}
