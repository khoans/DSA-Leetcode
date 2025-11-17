package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example18;

public class HTTPHandler implements Handler {
    public void receive(String data) {
        System.out.println("HTTP Received: " + data);
    }
}
