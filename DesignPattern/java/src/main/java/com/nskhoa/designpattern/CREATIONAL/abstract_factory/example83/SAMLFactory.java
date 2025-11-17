package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class SAMLFactory implements IdentityProviderAbstractFactory {
    public Provider createProvider() {
        return new SAMLProvider();
    }

    public Tokenizer createTokenizer() {
        return new SAMLTokenizer();
    }
}
