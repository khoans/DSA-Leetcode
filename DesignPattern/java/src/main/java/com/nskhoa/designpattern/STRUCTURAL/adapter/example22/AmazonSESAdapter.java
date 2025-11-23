package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class AmazonSESAdapter implements EmailService {
    private AmazonSESService ses = new AmazonSESService();

    public void sendEmail(String to, String subject, String body) {
        ses.sendSESMail(to, subject, body);
    }
}
