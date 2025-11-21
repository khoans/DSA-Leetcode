package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example59;

public class XMLRequester implements Requester {
    public String request(String endpoint) {
        return "<data>value</data>";
    }
}
