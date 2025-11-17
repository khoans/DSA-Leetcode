package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example69;

public class Runner {
    public static void main(String[] args) {
        GatewayAbstractFactory factory = new ProxyFactory();
        Router router = factory.createRouter();
        Authenticator authenticator = factory.createAuthenticator();

        System.out.println(router.route("/home"));
        System.out.println("Authenticated: " + authenticator.auth("token123"));
    }
}
