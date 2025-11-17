package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public class NexmoFactory implements SMSAbstractFactory {
    public Gateway createGateway() {
        return new NexmoGateway();
    }

    public Formatter createFormatter() {
        return new NexmoFormatter();
    }
}
