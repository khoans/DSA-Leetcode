package com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.oauth;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.Authenticator;

public class OAuthAuthenticator implements Authenticator {
    public boolean authenticate(String credentials) {
        return true;
    } // Simplified
}
