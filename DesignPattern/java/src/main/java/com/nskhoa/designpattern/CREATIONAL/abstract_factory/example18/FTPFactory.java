package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class FTPFactory implements NetworkAbstractFactory {
    public Protocol createProtocol() {
        return new FTPProtocol();
    }

    public Handler createHandler() {
        return new FTPHandler();
    }
}
