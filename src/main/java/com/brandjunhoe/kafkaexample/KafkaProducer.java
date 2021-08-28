package com.brandjunhoe.kafkaexample;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC = "exam";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        System.out.println("Produce message : " + message);
        // Kafka 서버로 메시지가 전송
        this.kafkaTemplate.send(TOPIC, message);
    }
}
