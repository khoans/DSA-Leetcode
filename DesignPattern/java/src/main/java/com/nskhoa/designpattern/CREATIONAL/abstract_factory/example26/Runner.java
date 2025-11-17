package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example26;

public class Runner {
    public static void main(String[] args) {
        SecurityAbstractFactory factory = new JWTFactory();
        Authenticator authenticator = factory.createAuthenticator();
        Authorizer authorizer = factory.createAuthorizer();

        authenticator.authenticate("sampleToken");
        authorizer.authorize("adminRole");
    }
}
