package com.kafka.springbootkafkatutorial.kafka;

import com.kafka.springbootkafkatutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger logger= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "himanshu_json", groupId = "myGroup")
    public void consume(User user) {
        logger.info(String.format("Json Message Received %s",user.toString()));

    }
}
