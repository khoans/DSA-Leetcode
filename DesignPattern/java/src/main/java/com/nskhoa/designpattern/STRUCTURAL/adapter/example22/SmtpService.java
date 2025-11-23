package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class SmtpService {
    void sendSmtpMail(String to, String subject, String body) {
        System.out.println("SMTP sending email to " + to);
    }
}
