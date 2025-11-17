package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example26;

public class SessionFactory implements SecurityAbstractFactory {
    public Authenticator createAuthenticator() {
        return new SessionAuthenticator();
    }

    public Authorizer createAuthorizer() {
        return new SessionAuthorizer();
    }
}
