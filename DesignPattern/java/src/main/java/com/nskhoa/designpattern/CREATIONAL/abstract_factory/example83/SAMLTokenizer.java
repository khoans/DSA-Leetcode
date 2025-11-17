package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class SAMLTokenizer implements Tokenizer {
    public String generateToken(String id) {
        return "SAML Token: " + id;
    }
}
