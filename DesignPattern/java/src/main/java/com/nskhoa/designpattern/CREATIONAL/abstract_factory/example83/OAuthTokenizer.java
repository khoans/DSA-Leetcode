package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example83;

public class OAuthTokenizer implements Tokenizer {
    public String generateToken(String id) {
        return "OAuth Token: " + id;
    }
}
