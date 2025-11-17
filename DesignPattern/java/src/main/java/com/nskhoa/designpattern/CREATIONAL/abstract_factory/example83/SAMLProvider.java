package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class SAMLProvider implements Provider {
    public String authenticate(String user) {
        return "SAML Auth for " + user;
    }
}
