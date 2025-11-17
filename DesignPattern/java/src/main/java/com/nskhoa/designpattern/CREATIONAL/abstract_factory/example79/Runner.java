package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public class Runner {
    public static void main(String[] args) {
        SMSAbstractFactory factory = new TwilioFactory();
        Gateway gateway = factory.createGateway();
        Formatter formatter = factory.createFormatter();
        String message = formatter.format("Hello World");
        gateway.send(message);

        factory = new NexmoFactory();
        gateway = factory.createGateway();
        formatter = factory.createFormatter();
        message = formatter.format("Hello World");
        gateway.send(message);
    }
}
