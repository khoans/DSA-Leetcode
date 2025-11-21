package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public class STOMPSender implements Sender {
    public void send(String message) {
        System.out.println("STOMP Sent: " + message);
    }
}
