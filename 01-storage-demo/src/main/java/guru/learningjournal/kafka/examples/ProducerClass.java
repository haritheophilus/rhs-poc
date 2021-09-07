package guru.learningjournal.kafka.examples;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProducerClass {
	//private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

	//	logger.info("Creating Kafka Producer...");
		String topicName = null;
		int numEvents = 50;

		if (args.length >= 1) {
			topicName = args[0];
			numEvents = Integer.parseInt(args[1]);
		}

		Properties props = new Properties();

		props.put(ProducerConfig.CLIENT_ID_CONFIG, AppConfigs.applicationID); // applicationID mainly for logging
																				// purposes
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.bootstrapServers);

		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);

	//	logger.info("Start sending messages...");
		/**
		 * By providing partition number ( a valid number )
		 * we confine the messages to go to one particular partition
		 */
		Integer partitionNumber = null; 
		
		/**
		 * if it is not null, kafka puts all the messages with the same key in one
		partition.If partition number is mentioned the messages go
		into that partition or else kafka decides on the partition.
		 */
		Integer key = null; 
		
		long time = System.currentTimeMillis();
		String msg = "Temp Message-";
		ProducerRecord<Integer, String> record = null;

		for (int i = 1; i <= numEvents; i++) {
			key = Integer.valueOf(i);
	//		record = new ProducerRecord<>(AppConfigs.topicName, partitionNumber, time, key, msg + i);
			record = new ProducerRecord<>(topicName,"Simple Message-" + i);
			try {
				RecordMetadata metadata = producer.send(record).get();
				System.out.println(
						String.format("record with (key: %s, value: %s), was sent to (partition: %d, offset: %d ",
								record.key(), record.value(), metadata.partition(), metadata.offset()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	//	logger.info("Finished - Closing Kafka Producer.");
		producer.close();

	}
}
