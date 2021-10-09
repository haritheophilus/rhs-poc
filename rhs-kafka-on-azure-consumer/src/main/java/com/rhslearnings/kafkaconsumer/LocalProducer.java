package com.rhslearnings.kafkaconsumer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.rhslearnings.kafkaonazure.model.ProducerMessageSerializer;
import com.rhslearnings.kafkaonazure.model.RequestModel;

@Service
public class LocalProducer {

	private static final Logger logger = LoggerFactory.getLogger(LocalProducer.class);

	@Autowired
	private KafkaTemplate<String, RequestModel> kafkaTemplate;
	@Value("${publishertopic.name}")
	private String topic;

	public void send(RequestModel requestModel) {
		logger.info("------------>> Local Kafka: Produced message in JSON ---------------------------->>>>");
		logger.info(requestModel.getInvoiceId());

		Properties prop = new Properties();
		prop.setProperty(ProducerConfig.CLIENT_ID_CONFIG, "myappid");
		prop.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092,localhost:9093");
		prop.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
		prop.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,ProducerMessageSerializer.class.getName());

		KafkaProducer<Integer, RequestModel> producer = new KafkaProducer<Integer, RequestModel>(prop);

		producer.send(new ProducerRecord<Integer, RequestModel>(topic,requestModel));

		producer.close();
		// kafkaTemplate.send(topic, requestModel);
	}
}
