package com.nskhoa.designpattern.STRUCTURAL.adapter.example13;

public class EmailAdapter implements NotificationService {
    private EmailService emailService = new EmailService();
    public void send(String message) {
        emailService.sendEmail(message);
    }
}
