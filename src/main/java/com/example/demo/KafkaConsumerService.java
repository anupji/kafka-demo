package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test", groupId = "demo-group")
    public void listen(String message) {
        // Logic to process the received message
        System.out.println("Received message: " + message);
    }
}
