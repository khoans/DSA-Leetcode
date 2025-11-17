package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example26;

public class SessionAuthorizer implements Authorizer {
    public boolean authorize(String role) {
        return true;
    }
}
