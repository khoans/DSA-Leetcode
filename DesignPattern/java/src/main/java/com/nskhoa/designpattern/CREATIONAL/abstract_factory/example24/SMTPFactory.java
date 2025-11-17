package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public class SMTPFactory implements EmailAbstractFactory {
    public Sender createSender() { return new SMTPSender(); }
    public Template createTemplate() { return new SMTPTemplate(); }
}
