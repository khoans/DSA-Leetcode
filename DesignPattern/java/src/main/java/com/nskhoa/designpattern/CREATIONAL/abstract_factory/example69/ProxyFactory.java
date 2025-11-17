package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class ProxyFactory implements GatewayAbstractFactory {
    public Router createRouter() {
        return new ProxyRouter();
    }

    public Authenticator createAuthenticator() {
        return new ProxyAuthenticator();
    }
}
