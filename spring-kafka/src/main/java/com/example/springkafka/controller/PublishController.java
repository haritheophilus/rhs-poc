package com.example.springkafka.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springkafka.listener.KafkaListenerBuilder;
import com.example.springkafka.models.RestoreSpecificTopics;
import com.example.springkafka.producer.Producer;

@RestController
@RequestMapping("/kafka")
public class PublishController {
    //Request to produce record
    private final Producer producer;

    @Autowired
    PublishController(Producer producer){
        this.producer = producer;
    }

    @Autowired
    KafkaListenerBuilder kafkaListenerBuilder;

    @PostMapping(value = "/publish")
    public void sendMessageToKafka(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }

    @PostMapping(value = "/restore")
    public void restoreToKafka(@RequestParam("dateString") String dateString) throws IOException {
        this.producer.restoreMessage(dateString, Producer.TOPIC_LIST);
    }

    @PostMapping(value = "/restoreRange")
    public void restoreToKafkaInDateRage(@RequestParam("startDate") String startDate,
                                         @RequestParam("endDate") String endDate) throws IOException {
        this.producer.restoreMessageInTheRange(startDate, endDate);
    }

    @PostMapping(value = "/restoreSpecific")
    public void restoreSpecificTopics(@RequestBody RestoreSpecificTopics restoreSpecificTopics ) throws IOException{
        this.producer.restoreSpecificTopics(restoreSpecificTopics);
    }

    @PostMapping(value="/startConsuming")
    public void startConsumingTopics(@RequestParam("topicName") String topicName){
        kafkaListenerBuilder.startConsumersForTopics(Producer.TOPIC_LIST);
    }

}

