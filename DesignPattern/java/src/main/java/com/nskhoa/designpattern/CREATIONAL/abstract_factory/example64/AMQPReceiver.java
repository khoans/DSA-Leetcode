package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example64;

public class AMQPReceiver implements Receiver {
    public String receive() {
        return "AMQP Message";
    }
}
