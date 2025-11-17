package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class DirectFactory implements GatewayAbstractFactory {
    public Router createRouter() {
        return new DirectRouter();
    }

    public Authenticator createAuthenticator() {
        return new DirectAuthenticator();
    }
}
