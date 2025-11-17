package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class Runner {
    public static void main(String[] args) {
        IdentityProviderAbstractFactory factory = new OAuthFactory();
        Provider provider = factory.createProvider();
        Tokenizer tokenizer = factory.createTokenizer();

        String user = "user123";
        String authResult = provider.authenticate(user);
        String token = tokenizer.generateToken("token123");

        System.out.println(authResult);
        System.out.println(token);
    }
}
