package com.sistemadistrbuidos3.sistemadistribuidos3.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendWelcomeEmail(String emailTo) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("marcelohenrikimiranha@gmail.com");
        simpleMailMessage.setTo(emailTo);
        simpleMailMessage.setSubject("Bem-vindo ao Nosso Serviço");
        simpleMailMessage.setText("Olá, ficamos felizes em ter voce por aqui!");

        try {
            emailSender.send(simpleMailMessage);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }

    public void sendUpdateEmail(String emailTo) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("marcelohenrikimiranha@gmail.com");
        simpleMailMessage.setTo(emailTo);
        simpleMailMessage.setSubject("Atualização de Informações");
        simpleMailMessage.setText("""
                Olá\s

                Suas informações foram atualizadas: nome, email, idade, senha e endereco""");

        try {
            emailSender.send(simpleMailMessage);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }
}
