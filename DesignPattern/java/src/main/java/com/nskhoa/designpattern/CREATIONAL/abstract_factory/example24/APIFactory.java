package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example24;

public class APIFactory implements EmailAbstractFactory {
    public Sender createSender() { return new APISender(); }
    public Template createTemplate() { return new APITemplate(); }
}
