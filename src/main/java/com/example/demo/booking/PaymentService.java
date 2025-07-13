package com.example.demo.booking;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @KafkaListener(topics = "${booking.topic.name}", groupId = "payment-group")
    public void listenBookingConfirmed(BookingEvent bookingEvent) {
        System.out.println("Received booking event: " + bookingEvent.getBookingId());
        // Process payment logic here
    }
}
