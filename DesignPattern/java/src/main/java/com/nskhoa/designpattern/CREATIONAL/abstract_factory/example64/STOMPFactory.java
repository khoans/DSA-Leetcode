package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public class STOMPFactory implements MessagingAbstractFactory {
    public Sender createSender() {
        return new STOMPSender();
    }

    public Receiver createReceiver() {
        return new STOMPReceiver();
    }
}
