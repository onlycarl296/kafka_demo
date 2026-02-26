package com.demo.statistic.service;

import com.demo.statistic.entity.StatisticDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Service;


@Service
public class StatisticService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @RetryableTopic(attempts = "5",dltTopicSuffix = "-dlt", backoff = @Backoff(delay = 2_000,multiplier = 2))
    @KafkaListener(id = "statisticGroup", topics = "statistic")
    public void listen(StatisticDTO statistic) {
        logger.info("Received: " + statistic.getMessage());
        logger.info("Save "+ statistic);
//		throw new RuntimeException("failed");
    }

    @KafkaListener(id = "dltGroup3", topics = "statistic-dlt")
    public void dltListen(String in) {
        logger.info("Received from DLT: ");
        System.out.println(in);
    }
}
