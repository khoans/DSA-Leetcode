package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public class NexmoGateway implements Gateway {
    public void send(String message) {
        System.out.println("Nexmo Sent: " + message);
    }
}
