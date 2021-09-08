package guru.learningjournal.kafka.examples;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class ConsumerClass {
//	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		String topicName = null;
		String consumerGroup = "defaultConsumerGroup";

		if (args.length >= 1) {
			consumerGroup = args[0];
			topicName = args[1];
		}
		System.out.println("Consumer is part of " + consumerGroup + " consumer group");
		System.out.println("polling on topic "+ topicName);
		
		if(topicName != null ) {
		KafkaConsumer<Integer, String> consumer = createConsumer(consumerGroup);
		consumeMessage(consumer, topicName);
		}else {
			System.out.println("Enter Topic name in IDE");
			System.exit(0);
		}

	}

	public static void consumeMessage(KafkaConsumer<Integer, String> consumer, String topic) {
		consumer.subscribe(Collections.singletonList(topic));// subscribe to a topic

		while (true) {
			ConsumerRecords<Integer, String> records = consumer.poll(Duration.ofSeconds(1));

			if (records.isEmpty()) {

			}

			for (ConsumerRecord<Integer, String> record : records) {
				System.out.println(String.format("Received record with (key: %s, value: %s, partition: %d, offset: %d ",
						record.key(), record.value(), record.partition(), record.offset()));
			}
			// process records
			consumer.commitAsync(); //COMMIT TO KAFKA THAT THE MESSAGE WAS RECEIVED

		}
		// consumer.close();
	}

	public static KafkaConsumer<Integer, String> createConsumer(String consumerGroup) {

		// logger.info("Processing Kafka Consumer Messages...");

		Properties props = new Properties();

		props.put(ConsumerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID);
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);

		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class.getName());
		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

		props.put(ConsumerConfig.GROUP_ID_CONFIG, consumerGroup);
		props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);// @TODO:

		return new KafkaConsumer<Integer, String>(props);
	}

}
