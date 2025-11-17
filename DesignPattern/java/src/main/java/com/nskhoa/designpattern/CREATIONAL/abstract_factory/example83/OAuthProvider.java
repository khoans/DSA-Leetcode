package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class OAuthProvider implements Provider {
    public String authenticate(String user) {
        return "OAuth Auth for " + user;
    }
}
