package com.rhslearnings.kafkaconsumer.model;

import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.rhslearnings.kafkaonazure.model.RequestModel;

public class ConsumerMessageSerializer extends JsonDeserializer<RequestModel> {

}
