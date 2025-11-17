package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class HTTPFactory implements NetworkAbstractFactory {
    public Protocol createProtocol() {
        return new HTTPProtocol();
    }

    public Handler createHandler() {
        return new HTTPHandler();
    }
}
