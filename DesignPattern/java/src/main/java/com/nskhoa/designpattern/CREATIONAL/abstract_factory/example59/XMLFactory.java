package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example59;

public class XMLFactory implements RESTAbstractFactory {
    public Requester createRequester() {
        return new XMLRequester();
    }

    public Responder createResponder() {
        return new XMLResponder();
    }
}
