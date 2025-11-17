package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public class SMTPSender implements Sender {
    public void send(String message) {
        System.out.println("SMTP Sent: " + message);
    }
}
