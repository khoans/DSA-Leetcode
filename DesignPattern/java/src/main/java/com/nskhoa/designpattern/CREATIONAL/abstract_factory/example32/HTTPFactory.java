package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example32;

public class HTTPFactory implements APIAbstractFactory {
    public Client createClient() {
        return new HTTPClient();
    }

    public Parser createParser() {
        return new HTTPParser();
    }
}
