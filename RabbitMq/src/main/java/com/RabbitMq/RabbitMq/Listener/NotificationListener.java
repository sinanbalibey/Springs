package com.RabbitMq.RabbitMq.Listener;

import com.RabbitMq.RabbitMq.Model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "siba-code-queue")
     public void handleMessage(Notification notification){
        System.out.println("Mesaj alındııııı");
         System.out.println(notification.toString());
     }
}
