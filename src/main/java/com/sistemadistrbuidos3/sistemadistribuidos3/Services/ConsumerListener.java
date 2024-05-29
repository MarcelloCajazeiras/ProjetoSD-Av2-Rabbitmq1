package com.sistemadistrbuidos3.sistemadistribuidos3.Services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "user.registration.email")
    public void userRegistartion(String email){
        emailService.sendWelcomeEmail(email);
    }

    @RabbitListener(queues = "user.update.Details")
    public void userUpdate(String email){
        emailService.sendUpdateEmail(email);
    }
}

