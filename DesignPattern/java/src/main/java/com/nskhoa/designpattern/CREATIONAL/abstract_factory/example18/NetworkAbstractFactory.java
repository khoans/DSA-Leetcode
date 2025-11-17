package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public interface NetworkAbstractFactory {
    Protocol createProtocol();

    Handler createHandler();
}

// Usage: NetworkAbstractFactory factory = new HTTPFactory(); Protocol proto = factory.createProtocol(); proto.send("data");

