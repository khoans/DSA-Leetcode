package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public class Runner {
    public static void main(String[] args) {
        MessagingAbstractFactory factory = new AMQPFactory();
        Sender sender = factory.createSender();
        Receiver receiver = factory.createReceiver();

        sender.send("order.processed");
        System.out.println(receiver.receive());
    }
}
