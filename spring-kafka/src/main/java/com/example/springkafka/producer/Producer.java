package com.example.springkafka.producer;

import com.example.springkafka.models.RestoreSpecificTopics;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Producer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    public static final ArrayList<String> TOPIC_LIST = new ArrayList<>(Arrays.asList("rules.new","rules.new1","rules.new2",
            "rules.new3"));

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        LOGGER.info(">>>>>PRODUCING>>>>>"+message);
        for(String TOPIC : TOPIC_LIST) {
            ProducerRecord<String, String> prd = new ProducerRecord<>(TOPIC, message);
            prd.headers().add("someHeader", "someHeader".getBytes());
            this.kafkaTemplate.send(prd);
        }
    }

    public void restoreMessage(String dateString, List<String> topics) throws IOException {
        LOGGER.info(">>>>>PRODUCING>>>>>"+dateString);
        for(String TOPIC : topics) {
            StringBuilder filePathBuilder = new StringBuilder();
            filePathBuilder.append("C://BackupNew/");
            filePathBuilder.append(TOPIC);
            filePathBuilder.append(dateString);
            filePathBuilder.append(".txt");
            File file = new File(filePathBuilder.toString());
            if(!file.exists()) continue;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                this.kafkaTemplate.send(TOPIC, line);
            }
        }
    }

    public void restoreMessageInTheRange(String startDate, String endDate) throws IOException{
        LOGGER.info(">>>>PRODUCING BETWEEN RANGE>>>");
        LocalDate startingDate = LocalDate.parse(startDate);
        LocalDate endingDate = LocalDate.parse(endDate);
        while(endingDate.compareTo(startingDate) >= 0){
            restoreMessage(startingDate.toString(), this.TOPIC_LIST);
            startingDate = startingDate.plusDays(1);
        }
    }

    public void restoreSpecificTopics(RestoreSpecificTopics restoreSpecificTopics) throws IOException{
        LOGGER.info(">>>PRODUCING SPECIFIC TOPICS>>>");
        LocalDate startingDate = LocalDate.parse(restoreSpecificTopics.getStartDate());
        LocalDate endingDate = LocalDate.parse(restoreSpecificTopics.getEndDate());
        while(endingDate.compareTo(startingDate) >= 0){
            restoreMessage(startingDate.toString(), restoreSpecificTopics.getTopics());
            startingDate = startingDate.plusDays(1);
        }
    }
}
