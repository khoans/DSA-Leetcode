package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public interface GatewayAbstractFactory {
    Router createRouter();

    Authenticator createAuthenticator();
}

