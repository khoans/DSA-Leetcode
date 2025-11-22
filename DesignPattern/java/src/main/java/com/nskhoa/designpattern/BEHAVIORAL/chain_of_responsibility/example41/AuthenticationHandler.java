package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example41;

public class AuthenticationHandler extends NetworkRequestHandler {
    @Override
    public void handle(NetworkRequest request) {
        if (request.getAuthToken() != null && !request
                .getAuthToken()
                .isEmpty()) {
            System.out.println("Authentication successful.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
        else {
            System.out.println("Authentication failed.");
        }
    }
}
