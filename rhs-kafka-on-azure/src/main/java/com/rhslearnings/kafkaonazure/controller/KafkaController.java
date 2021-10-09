package com.rhslearnings.kafkaonazure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhslearnings.kafkaonazure.model.RequestModel;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KafkaController {

	@Autowired
    private  KafkaProducer kafkaProducer;

    @PostMapping(value="send", consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public void sendData(@RequestBody RequestModel model) {
//    	for(int i = 0; i<=1000;i++)
        this.kafkaProducer.send(model);
    }
}