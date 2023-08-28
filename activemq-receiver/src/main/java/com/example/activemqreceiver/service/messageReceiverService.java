package com.example.activemqreceiver.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class messageReceiverService {

    @JmsListener(destination = "frs it")
    public void Listener(String name){

        System.out.println("the name send from the queus is : "+name);

    }
}
