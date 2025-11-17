package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class ProxyAuthenticator implements Authenticator {
    public boolean auth(String token) {
        return true;
    }
}
