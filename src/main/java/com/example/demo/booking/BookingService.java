package com.example.demo.booking;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final KafkaTemplate<String, BookingEvent> kafkaTemplate;

    @Value("${booking.topic.name}")
    private String topicName;

    public BookingService(@Qualifier("bookingEventKafkaTemplate") KafkaTemplate<String, BookingEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void confirmBooking(BookingEvent event) {
        // business logic to confirm booking
        kafkaTemplate.send(topicName, event);
        System.out.println("Booking confirmed event sent: " + event.getBookingId());
    }
}
