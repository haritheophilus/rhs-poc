package com.rhslearnings.kafka.streams.functional.impl.config;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.finserv.data.model.CardV11;
import com.rhslearnings.kafka.streams.functional.impl.service.ActualTransformer;
import com.rhslearnings.kafkastreams.republish.data.model.Notification;

@Configuration
public class ActualProcessor {
	
	@Autowired
	ActualTransformer actualTransformer;
	
	@Bean
	public Function<KStream<String, CardV11>, KStream<String, Notification>> process() {

		return input -> { 
			System.out.println("================    cardservices ====================================");
			KStream<String, CardV11> stream =  input.filter( (k, v) -> v.getData().getCard().getIsPrimaryOwner()); //filter on some condition
			
			return stream.mapValues(v -> actualTransformer.getNotification(v));
		};
	}
	
	
	
	//@Bean
	/*
	 * public Function<KStream<String, CardInfo>, KStream<String, Notification>>
	 * process() {
	 * 
	 * return input -> { KStream<String, CardInfo> stream = input.filter( (k, v) ->
	 * v.getEventType().equalsIgnoreCase("CARDINFO") ); return stream.mapValues(v ->
	 * actualTransformer.getNotification(v)); }; }
	 */

 @Bean
	public Consumer<KStream<String, Notification>> listen() {

		return input -> {
			System.out.println("================    bank solutions ====================================");
			input.peek(((key, value) -> System.out.println(String.format("\n\n-- From BankSolutions ---  , value: %s ", value))));
			System.out.println("================    bank solutions END  ====================================");
		};

	}

}
