package com.rhslearnings.cardservices.jason.producer;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.rhslearnings.kafka.json.producer.data.model.CardInfo;

public class StanadloneProducer {
	  private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		
		String topicName = "cardservices";
		int noOfProducers = 2;
		int produceSpeed = 3000;//milli-sec

		Properties properties = new Properties();
		properties.put(ProducerConfig.CLIENT_ID_CONFIG, "rhsjsonproducer");
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:8092,localhost:8093");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonSerializer.class);

		KafkaProducer<String, CardInfo> kafkaProducer = new KafkaProducer<>(properties);
		ExecutorService executor = Executors.newFixedThreadPool(noOfProducers);
		final List<RunnableProducer> runnableProducers = new ArrayList<>();

		for (int i = 0; i < noOfProducers; i++) {
			RunnableProducer runnableProducer = new RunnableProducer(i, kafkaProducer, topicName, produceSpeed);
			runnableProducers.add(runnableProducer);
			executor.submit(runnableProducer);
		}

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			for (RunnableProducer p : runnableProducers)
				p.shutdown();
			executor.shutdown();
			logger.info("Closing Executor Service");
			try {
				executor.awaitTermination(produceSpeed * 2, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}));

	}
}
