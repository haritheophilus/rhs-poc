package com.rhs.example.kafkastreams.listener.service;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import com.rhs.example.kafkastreams.bindings.MyKafkaListenerBinding;
import com.rhslearnings.kafka.json.producer.data.model.CardInfo;

import lombok.extern.log4j.Log4j2;
import om.rhs.example.kafkastreams.data.model.Notification;

//@Service
//@Log4j2
//@EnableBinding(MyKafkaListenerBinding.class)
public class MyKafkaListenerService {
	
	@Autowired
	RecordBuilder record;
	
	@StreamListener("input-channel-1")
	@SendTo("output-channel-1")
	public KStream<String, Notification> consumeCardServices(KStream<String,CardInfo> input) {
		
		input.foreach((k,v) -> System.out.println(String.format("Topic: ************ From CardServices *********, value: %s",v + "\n\n") ));
		
		KStream<String, Notification> stream = input.filter( (k,v) -> 
		v.getEventType().equalsIgnoreCase("CARDINFO") ).mapValues(v -> record.getNotification(v));
	
		stream.foreach((k,v) -> System.out.println(String.format("Topic: ************ Notifications *********, value: %s ",v + "\n") ));
		
		return stream;
	}
	
	@StreamListener("output-channel-1")
	public void consumeBankSolutions(KStream<String,Notification> input) {
		
		input.foreach((k,v) -> System.out.println(String.format("\n\n-- From BankSolutions ---  , value: %s ",v ) ));
		
	}

}
