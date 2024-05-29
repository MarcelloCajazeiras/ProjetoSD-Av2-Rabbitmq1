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

    public void sendWelcomeEmail(String email, String name) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Bem-vindo ao Nosso Serviço");
        message.setText("Olá " + name + ",\n\nBem-vindo ao nosso serviço!");

        try {
            emailSender.send(message);
            System.out.println("E-mail de boas-vindas enviado para: " + email);
        } catch (MailException e) {
            System.out.println("Erro ao enviar e-mail de boas-vindas para: " + email);
            e.printStackTrace();
        }
    }

    public void sendUpdateEmail(String email, String name, String updatedFields) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Atualização de Informações");
        message.setText("Olá " + name + ",\n\nSuas informações foram atualizadas: " + updatedFields);

        try {
            emailSender.send(message);
            System.out.println("E-mail de atualização enviado para: " + email);
        } catch (MailException e) {
            System.out.println("Erro ao enviar e-mail de atualização para: " + email);
            e.printStackTrace();
        }
    }
}
