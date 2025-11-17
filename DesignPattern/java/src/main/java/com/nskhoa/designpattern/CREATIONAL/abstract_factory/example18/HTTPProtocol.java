package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class HTTPProtocol implements Protocol {
    public void send(String data) {
        System.out.println("HTTP Sent: " + data);
    }
}
