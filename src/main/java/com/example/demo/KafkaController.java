package com.example.demo;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producer;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        // Logic to send message using kafkaProducer
        // For example: kafkaProducer.send(new ProducerRecord<>("topic", message));
        producer.sendMessage("test", message);
        return ResponseEntity.ok("Message sent successfully");
    }
}
