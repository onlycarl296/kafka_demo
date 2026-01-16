package com.demo.notification.service;

import com.demo.notification.model.MessageDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

public interface EmailService {
    void sendEmail(MessageDTO messageDTO);
}

@Service
class EmailServiceImpl implements EmailService {
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    @Async
    public void sendEmail(MessageDTO messageDTO) {
        try {
            logger.info("START... Sending email");


            logger.info("END... Email sent success");
        } catch (Exception e) {
            logger.error("Email sent with error: " + e.getMessage());
        }
    }
}