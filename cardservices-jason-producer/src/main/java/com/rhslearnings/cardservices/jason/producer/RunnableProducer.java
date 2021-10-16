package com.rhslearnings.cardservices.jason.producer;

import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.finserv.data.model.CardV11;
import com.rhslearnings.cardservices.jason.producer.data.generator.DataGenerator;
import com.rhslearnings.kafka.json.producer.data.model.CardInfo;


public class RunnableProducer implements Runnable {
    private static final Logger logger = LogManager.getLogger();
    private final AtomicBoolean stopper = new AtomicBoolean(false);
    private KafkaProducer<String, CardV11> producer;
    private String topicName;
    private DataGenerator dataGenerator;
    private int produceSpeed;
    private int id;

    RunnableProducer(int id, KafkaProducer<String, CardV11> producer, String topicName, int produceSpeed) {
        this.id = id;
        this.producer = producer;
        this.topicName = topicName;
        this.produceSpeed = produceSpeed;
        this.dataGenerator = DataGenerator.getInstance();
    }
    @Override
    public void run() {
        try {
            logger.info("Starting producer thread - " + id);
            while (!stopper.get()) {
            	CardV11 cardInfo = dataGenerator.getNextInfo();
                producer.send(new ProducerRecord<>(topicName,cardInfo));
                logger.info(" Produced This message: "+cardInfo);
                Thread.sleep(produceSpeed);
            }

        } catch (Exception e) {
            logger.error("Exception in Producer thread - " + id);
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    void shutdown() {
        logger.info("Shutting down producer thread - " + id);
        stopper.set(true);

    }
}
