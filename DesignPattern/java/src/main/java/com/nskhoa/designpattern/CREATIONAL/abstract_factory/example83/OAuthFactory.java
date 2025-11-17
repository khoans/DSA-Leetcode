package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class OAuthFactory implements IdentityProviderAbstractFactory {
    public Provider createProvider() {
        return new OAuthProvider();
    }

    public Tokenizer createTokenizer() {
        return new OAuthTokenizer();
    }
}

