package com.rhslearnings.kafka.streams.functional.config;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rhslearnings.kafka.json.producer.data.model.CardInfo;
import com.rhslearnings.kafka.streams.functional.output.data.model.Notification;
import com.rhslearnings.kafka.streams.functional.service.RecordBuilder;

@Configuration
@EnableAutoConfiguration
public class MyConfigListener {
	
	@Autowired
	RecordBuilder record;
	
	  @Bean
	  public Function<KStream<String,CardInfo>, KStream<String,Notification> > process() {
		  
		  
	  return input -> ( input.filter( (k,v) -> v.getEventType().equalsIgnoreCase("CARDINFO") ).mapValues(v -> record.getNotification(v) ) );
	  
	  }
	  
		/*
		 * @Bean public Consumer<KStream<String,Notification> > consumeBankSoln() {
		 * 
		 * 
		 * return input -> { input.peek(((key, value) -> System.out.println(String.
		 * format("\n\n-- From BankSolutions ---  , value: %s ",value ) ))); };
		 * 
		 * }
		 */
	 
}
