package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public interface MessagingAbstractFactory {
    Sender createSender();

    Receiver createReceiver();
}

// Usage: MessagingAbstractFactory factory = new AMQPFactory(); Sender sender = factory.createSender(); sender.send("order.processed");

