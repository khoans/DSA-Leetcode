package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example32;

public class HTTPClient implements Client {
    public String request(String endpoint) {
        return "HTTP Response";
    }
}
