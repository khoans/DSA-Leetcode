package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public class AMQPSender implements Sender {
    public void send(String message) {
        System.out.println("AMQP Sent: " + message);
    }
}
