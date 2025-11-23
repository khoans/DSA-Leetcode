package com.nskhoa.designpattern.STRUCTURAL.adapter.example22;

public class AmazonSESService {
    void sendSESMail(String to, String subject, String body) {
        System.out.println("Amazon SES sending email to " + to);
    }
}
