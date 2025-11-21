package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example59;

public class JSONFactory implements RESTAbstractFactory {
    public Requester createRequester() {
        return new JSONRequester();
    }

    public Responder createResponder() {
        return new JSONResponder();
    }
}
