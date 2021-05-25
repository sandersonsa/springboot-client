package com.redhat.banestes.amq.springbootclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
 
import lombok.extern.slf4j.Slf4j;
 
@Component
public class ProducerService {
 
    @Autowired
    private JmsTemplate jmsTemplate;
 
    public void sendTo(String destination, String message) {
        jmsTemplate.convertAndSend(destination, message);
    }
}