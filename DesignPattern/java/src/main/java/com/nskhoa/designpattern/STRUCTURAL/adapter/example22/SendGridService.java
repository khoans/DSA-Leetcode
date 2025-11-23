package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class SendGridService {
    void sendSendGridMail(String to, String subject, String body) {
        System.out.println("SendGrid sending email to " + to);
    }
}
