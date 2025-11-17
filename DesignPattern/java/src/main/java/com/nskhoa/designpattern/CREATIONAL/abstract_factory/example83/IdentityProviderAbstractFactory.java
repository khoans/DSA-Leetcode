package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public interface IdentityProviderAbstractFactory {
    Provider createProvider();

    Tokenizer createTokenizer();
}
