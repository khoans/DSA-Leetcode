package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example5;

// Concrete Handlers
public class UsernamePasswordAuth extends AuthHandler {
    @Override
    public void authenticate(AuthRequest request) {
        if (request
                .getCredentials()
                .contains("username/password")) {
            System.out.println("Username/Password authentication passed.");
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
