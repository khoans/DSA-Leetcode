package com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.oauth;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.AuthFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example18.factory.Authenticator;

public class OAuthFactory extends AuthFactory {
    public Authenticator createAuthenticator() {
        return new OAuthAuthenticator();
    }

}
