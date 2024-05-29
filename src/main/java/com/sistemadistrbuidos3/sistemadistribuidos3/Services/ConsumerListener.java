package com.sistemadistrbuidos3.sistemadistribuidos3.Services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {
    @RabbitListener(queues = "user.registration")
    public void userRegistartion(String email){
    }

    @RabbitListener(queues = "user.update")
    public void userUpdate(String mensage){
        String [] dados = mensage.split("=");
        String email = dados[0];
        String data = dados[1];

    }
}

