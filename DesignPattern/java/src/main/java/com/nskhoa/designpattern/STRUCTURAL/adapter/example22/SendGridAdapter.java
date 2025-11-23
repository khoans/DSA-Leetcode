package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class SendGridAdapter implements EmailService {
    private SendGridService sendGrid = new SendGridService();

    public void sendEmail(String to, String subject, String body) {
        sendGrid.sendSendGridMail(to, subject, body);
    }
}
