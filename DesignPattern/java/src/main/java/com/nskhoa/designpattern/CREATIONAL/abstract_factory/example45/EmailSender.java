package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example45;

public class EmailSender implements Sender {
    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}
