package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example26;

public class JWTAuthenticator implements Authenticator {
    public boolean authenticate(String token) {
        return true;
    }
}
