package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example79;

public class TwilioFactory implements SMSAbstractFactory {
    public Gateway createGateway() {
        return new TwilioGateway();
    }

    public Formatter createFormatter() {
        return new TwilioFormatter();
    }
}
