package com.example.springkafka.consumer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.example.springkafka.service.AmazonClient;
import com.example.springkafka.service.AzureTestClient;
import com.example.springkafka.service.RHSTestClient;

@Service
public class Consumer {

    LocalDate localDate = LocalDate.now();

    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private AmazonClient amazonClient;
    
    @Autowired
    private RHSTestClient rhsAwsClient;
    
    @Autowired
    private AzureTestClient azureClient;

    @Value("${backup.folder}")
    private String backupFolder;

    @Value("${backup.extension}")
    private String fileExtension;

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "rules.new", groupId = "group_id")
    public void consumeMultiple(String message) throws IOException {
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
    public void consume(@Payload String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topicName) throws IOException{
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
        rhsAwsClient.uploadFile(file, localDate+":"+topicName);
        azureClient.uploadFile(file, localDate+":"+topicName);
        //amazonClient.uploadFile(file,localDate+":"+topicName);
    }
}
