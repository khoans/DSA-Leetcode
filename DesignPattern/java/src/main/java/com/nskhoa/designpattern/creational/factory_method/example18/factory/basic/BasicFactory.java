package com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.basic;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.AuthFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.Authenticator;

public class BasicFactory extends AuthFactory {
    public Authenticator createAuthenticator() {
        return new BasicAuthenticator();
    }
}
