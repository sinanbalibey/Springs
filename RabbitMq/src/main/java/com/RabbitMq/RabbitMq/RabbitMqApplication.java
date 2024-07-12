package com.RabbitMq.RabbitMq;

import com.RabbitMq.RabbitMq.Model.Notification;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RabbitMqApplication {



	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);


	}

}
