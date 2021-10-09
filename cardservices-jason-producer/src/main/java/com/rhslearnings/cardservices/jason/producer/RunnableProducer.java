package com.rhslearnings.cardservices.jason.producer;

import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rhslearnings.cardservices.jason.producer.data.generator.CardInfoGenerator;
import com.rhslearnings.kafka.json.producer.data.model.CardInfo;


public class RunnableProducer implements Runnable {
    private static final Logger logger = LogManager.getLogger();
    private final AtomicBoolean stopper = new AtomicBoolean(false);
    private KafkaProducer<String, CardInfo> producer;
    private String topicName;
    private CardInfoGenerator cardInfoGenerator;
    private int produceSpeed;
    private int id;

    RunnableProducer(int id, KafkaProducer<String, CardInfo> producer, String topicName, int produceSpeed) {
        this.id = id;
        this.producer = producer;
        this.topicName = topicName;
        this.produceSpeed = produceSpeed;
        this.cardInfoGenerator = CardInfoGenerator.getInstance();
    }
    @Override
    public void run() {
        try {
            logger.info("Starting producer thread - " + id);
            while (!stopper.get()) {
                CardInfo cardInfo = cardInfoGenerator.getNextInfo();
                producer.send(new ProducerRecord<>(topicName,cardInfo));
                logger.info(" Produced This message: "+cardInfo);
                Thread.sleep(produceSpeed);
            }

        } catch (Exception e) {
            logger.error("Exception in Producer thread - " + id);
            throw new RuntimeException(e);
        }

    }

    void shutdown() {
        logger.info("Shutting down producer thread - " + id);
        stopper.set(true);

    }
}
