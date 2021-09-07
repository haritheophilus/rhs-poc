package com.example.springkafka.listener;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;
import sun.plugin2.message.Message;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.apache.kafka.clients.CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG;
import static org.apache.kafka.clients.CommonClientConfigs.GROUP_ID_CONFIG;

@Service
@Slf4j
public class KafkaListenerBuilder {

    LocalDate localDate = LocalDate.now();

    @Value("${spring.kafka.consumer.bootstrap-servers}")
    private String bootStrapServer;

    @Value("${backup.folder}")
    private String backupFolder;

    @Value("${backup.extension}")
    private String fileExtension;

    public void startMessageListener(String topicName){
        Map<String, Object> consumerConfig = ImmutableMap.of(
                BOOTSTRAP_SERVERS_CONFIG, bootStrapServer,
                GROUP_ID_CONFIG, "concurrentGroupID");
        DefaultKafkaConsumerFactory<String, String> kafkaConsumerFactory = new DefaultKafkaConsumerFactory<>(
                consumerConfig, new StringDeserializer(), new StringDeserializer());
        ContainerProperties containerProperties = new ContainerProperties(topicName);
        containerProperties.setMessageListener((MessageListener<String, String>) val -> {
            Headers headers = val.headers();
            String message = val.value();
            this.backUp(message, topicName);
        });
        ConcurrentMessageListenerContainer container = new ConcurrentMessageListenerContainer(kafkaConsumerFactory,
                containerProperties);
        container.start();
    }

    private void backUp(String message, String topicName) {
        localDate = LocalDate.now().compareTo(localDate) > 0 ? LocalDate.now() : localDate;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(backupFolder);
        stringBuilder.append(topicName);
        stringBuilder.append(localDate.toString());
        stringBuilder.append(fileExtension);
        try {
            File file = new File(stringBuilder.toString());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            file.createNewFile();
            writer.append(message+"\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startConsumersForTopics(List<String> topicList){
        for(String topic : topicList){
            this.startMessageListener(topic);
        }
    }

    public void logMessage(String val){
        log.info("Consuming *** {}", val);
    }
}
