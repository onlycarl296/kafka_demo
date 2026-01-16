package com.demo.notification.service;

import com.demo.notification.model.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "notification",
            groupId = "group_id") // Khai báo rằng với topic này thì sẽ cụm consumer với group_id như ở đây phân chia để xác định consumer nào nhận partition nào
    // Method
    public void
    consume(String message)
    {
        // Print statement
        System.out.println("message = " + message);
    }

}