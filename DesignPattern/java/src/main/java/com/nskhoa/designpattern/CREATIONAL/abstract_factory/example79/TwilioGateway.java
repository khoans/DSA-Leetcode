package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public class TwilioGateway implements Gateway {
    public void send(String message) {
        System.out.println("Twilio Sent: " + message);
    }
}
