package com.nskhoa.designpattern.creational.factory_method.example18;

import com.nskhoa.designpattern.creational.factory_method.example18.factory.AuthFactory;
import com.nskhoa.designpattern.creational.factory_method.example18.factory.Authenticator;
import com.nskhoa.designpattern.creational.factory_method.example18.factory.basic.BasicFactory;
import com.nskhoa.designpattern.creational.factory_method.example18.factory.oauth.OAuthFactory;

public class Runner {
    public static void main(String[] args) {
        AuthFactory oauthFactory = new OAuthFactory();
        Authenticator oauthFactoryAuthenticator = oauthFactory.createAuthenticator();
        oauthFactoryAuthenticator.authenticate("my-oauth-token");

        AuthFactory basicFactory = new BasicFactory();
        Authenticator basicFactoryAuthenticator = basicFactory.createAuthenticator();
        basicFactoryAuthenticator.authenticate("username:password");
    }
}
