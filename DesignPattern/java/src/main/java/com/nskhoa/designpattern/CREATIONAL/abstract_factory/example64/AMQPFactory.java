package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public class AMQPFactory implements MessagingAbstractFactory {
    public Sender createSender() {
        return new AMQPSender();
    }

    public Receiver createReceiver() {
        return new AMQPReceiver();
    }
}
