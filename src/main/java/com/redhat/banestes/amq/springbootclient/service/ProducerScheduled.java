package com.redhat.banestes.amq.springbootclient.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProducerScheduled {

    @Autowired
    private ProducerService produceService;

    @Value("${app.springboot.queue}")
    private String destination;

    @Scheduled(fixedRate = 3000)
    public void sendMsg() {
        produceService.sendTo(destination, " ## Msg Agendada - " + LocalDateTime.now().toString());
    }

}
