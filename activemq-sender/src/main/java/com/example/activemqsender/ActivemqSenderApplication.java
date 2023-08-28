package com.example.activemqsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqSenderApplication.class, args);
		System.out.println("mq------------------------");
	}

}
