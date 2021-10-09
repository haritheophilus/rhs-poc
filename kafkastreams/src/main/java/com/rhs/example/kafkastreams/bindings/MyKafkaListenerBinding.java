package com.rhs.example.kafkastreams.bindings;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

import com.rhslearnings.kafka.json.producer.data.model.CardInfo;

import om.rhs.example.kafkastreams.data.model.Notification;

public interface MyKafkaListenerBinding {
	
	@Input("input-channel-1")
	KStream<String,CardInfo> cardInfoInputStream();
	
	@Output("output-channel-1")
	KStream<String,Notification> cardInfoOutputStream();

}
