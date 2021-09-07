package com.example.springkafka.consumer;

import com.example.springkafka.service.AmazonClient;
import org.apache.tomcat.jni.Local;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDate;

@Service
public class Consumer {

    LocalDate localDate = LocalDate.now();

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private AmazonClient amazonClient;

    @Value("${backup.folder}")
    private String backupFolder;

    @Value("${backup.extension}")
    private String fileExtension;

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "rules.new", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info("<<<Consuming<<< {}", message);
        localDate = LocalDate.now().compareTo(localDate) > 0 ? LocalDate.now() : localDate;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(backupFolder);
        stringBuilder.append(localDate.toString());
        stringBuilder.append(fileExtension);
        logger.info("File path {}", stringBuilder.toString());
        File file = new File(stringBuilder.toString());
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.append(message+"\n");
        writer.close();

    }

    @KafkaListener(topics = {"rules.new", "rules.new1"}, groupId = "multiple-group")
    public void consumeMultiple(@Payload String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topicName) throws IOException{
        logger.info("<<<Consuming<<< {}", message);
        localDate = LocalDate.now().compareTo(localDate) > 0 ? LocalDate.now() : localDate;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(backupFolder);
        stringBuilder.append(topicName);
        stringBuilder.append(localDate.toString());
        stringBuilder.append(fileExtension);
        File file = new File(stringBuilder.toString());
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.append(message+"\n");
        writer.close();
        amazonClient.uploadFile(file,localDate+":"+topicName);
    }
}
