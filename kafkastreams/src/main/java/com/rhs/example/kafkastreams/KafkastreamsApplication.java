package com.rhs.example.kafkastreams;

import java.util.function.Consumer;
import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rhslearnings.kafka.json.producer.data.model.CardInfo;

@SpringBootApplication
public class KafkastreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkastreamsApplication.class, args);
		
	}
	@Bean
	public Function<KStream<String, CardInfo>, KStream<String, CardInfo>> process() {

		return input -> input.filter((k, v) -> {

			if (v.getEventType().equalsIgnoreCase("CARDINFO")) {
				System.out.println("Gotcha!!!!");
			}
			return v.getEventType().equalsIgnoreCase("CARDINFO");
		});

	}

//	@Bean
	public Consumer<KStream<String, CardInfo>> output() {

		return input -> {
			input.peek(((key, value) -> System.out
					.println(String.format("\n\n-- From BankSolutions ---  , value: %s ", value))));
		};

	}

}
