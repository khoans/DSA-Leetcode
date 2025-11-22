package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example5;

public class OAuthAuth extends AuthHandler {
    @Override
    public void authenticate(AuthRequest request) {
        if (request
                .getCredentials()
                .contains("OAuth")) {
            System.out.println("OAuth authentication passed.");
            if (nextHandler != null) {
                nextHandler.authenticate(request);
            }
        }
        else if (nextHandler != null) {
            nextHandler.authenticate(request);
        }
        else {
            System.out.println("Authentication failed.");
        }
    }
}
