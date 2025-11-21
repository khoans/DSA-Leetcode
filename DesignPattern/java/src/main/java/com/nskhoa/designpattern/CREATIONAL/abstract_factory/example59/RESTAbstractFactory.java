package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example59;

public interface RESTAbstractFactory {
    Requester createRequester();

    Responder createResponder();
}

// Usage: RESTAbstractFactory factory = new JSONFactory(); Requester req = factory.createRequester(); String resp = req.request("/api/data");

