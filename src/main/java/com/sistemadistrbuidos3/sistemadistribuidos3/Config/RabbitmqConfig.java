package com.sistemadistrbuidos3.sistemadistribuidos3.Config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue UserRegistrationQueue(){
        return new Queue("user.registration.email");
    }

    @Bean
    public Queue UserUpdateQueue(){
        return new Queue("user.update.Details");
    }
}

