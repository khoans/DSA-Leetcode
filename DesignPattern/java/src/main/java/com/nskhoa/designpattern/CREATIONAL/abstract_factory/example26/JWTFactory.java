package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example26;

public class JWTFactory implements SecurityAbstractFactory {
    public Authenticator createAuthenticator() {
        return new JWTAuthenticator();
    }

    public Authorizer createAuthorizer() {
        return new JTAAuthorizer();
    }
}
