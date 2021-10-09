package com.rhslearnings.kafkaonazure.model;

import org.springframework.kafka.support.serializer.JsonSerializer;

public class ProducerMessageSerializer extends JsonSerializer<RequestModel> {
///We can also implement Serializer interface and override the methods.

}
