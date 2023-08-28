package com.example.activemqsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.activemqsender.service.SendMessageService;



@RestController()
public class SendContoller {

    @Autowired
    SendMessageService sendMessageService;

    @GetMapping("/send/{name}")
    public String SendName(@PathVariable("name") String name ){
        sendMessageService.SendName(name);
        System.out.println("sould be there in activeMQ");
        return name ;
    }
    
}
