package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example59;

public class Runner {
    public static void main(String[] args) {
        RESTAbstractFactory factory = new JSONFactory();
        Requester requester = factory.createRequester();
        Responder responder = factory.createResponder();

        String response = requester.request("/api/data");
        Object data = responder.parse(response);

        System.out.println("Response: " + response);
    }
}
