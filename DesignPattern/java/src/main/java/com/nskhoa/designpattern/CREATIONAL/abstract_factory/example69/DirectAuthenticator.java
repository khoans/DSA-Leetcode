package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class DirectAuthenticator implements Authenticator {
    public boolean auth(String token) {
        return true;
    }
}
