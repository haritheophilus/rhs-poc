package com.learning.azure.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.azure.kafka.producer.Producer;

@RestController
@RequestMapping("kafka")
public class PublishController {
	// Request to produce record
	private final Producer producer;

	@Autowired
	PublishController(Producer producer) {
		this.producer = producer;
	}

	@GetMapping(value = "/publish")
	public String sendMessageToKafkaFromUI(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
		return "Message Sent";
	}

	@PostMapping(value = "/publish", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public void sendMessageToKafka(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
	}

	@GetMapping(value = "/check")
	public String checkApp() {
		return "Mike Testing";
	}

}
