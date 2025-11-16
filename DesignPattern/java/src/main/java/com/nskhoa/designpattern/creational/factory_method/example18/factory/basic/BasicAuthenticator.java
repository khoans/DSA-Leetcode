package com.nskhoa.designpattern.creational.factory_method.example18.factory.basic;

import com.nskhoa.designpattern.creational.factory_method.example18.factory.Authenticator;

public class BasicAuthenticator implements Authenticator {
    public boolean authenticate(String credentials) { return true; } // Simplified
}
