package com.example.activemqsender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendMessageService {

    private JmsTemplate jmsTemplate;

    @Autowired
    public SendMessageService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }


    public void SendName(String name){
        jmsTemplate.convertAndSend("frs it", name);
    }


    
}
