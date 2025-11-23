package com.nskhoa.designpattern.STRUCTURAL.adapter.example12;

public class OAuthAdapter implements Authenticator {
    private OAuthService oauth = new OAuthService();

    public boolean authenticate(String user, String pass) {
        // Here user/pass ignored, using token as pass just for example
        return oauth.oauthLogin(pass);
    }
}
