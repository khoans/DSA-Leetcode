package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example59;

public class JSONRequester implements Requester {
    public String request(String endpoint) {
        return "{\"data\":\"value\"}";
    }
}
