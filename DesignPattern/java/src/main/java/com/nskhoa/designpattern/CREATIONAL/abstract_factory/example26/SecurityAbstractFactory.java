package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example26;

public interface SecurityAbstractFactory {
    Authenticator createAuthenticator();

    Authorizer createAuthorizer();
}

// Usage: SecurityAbstractFactory factory = new JWTFactory(); Authenticator auth = factory.createAuthenticator(); auth.authenticate("token");

