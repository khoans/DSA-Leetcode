package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example22;

public class OAuthAuthenticator extends Authenticator {
    @Override
    public void authenticate(ApiRequest request) {
        if (request.getOauthToken() != null && !request.getOauthToken().isEmpty()) {
            System.out.println("OAuth authentication passed.");
        } else if (nextAuthenticator != null) {
            nextAuthenticator.authenticate(request);
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
