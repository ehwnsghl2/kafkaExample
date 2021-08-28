package com.brandjunhoe.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "exam", groupId = "foo")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message : " + message);
    }

}
