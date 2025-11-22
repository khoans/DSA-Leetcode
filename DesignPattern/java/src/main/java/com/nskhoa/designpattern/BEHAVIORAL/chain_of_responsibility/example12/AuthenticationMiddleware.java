package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example12;

public class AuthenticationMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        System.out.println("Authenticating request for URL: " + request.getUrl());
        if (next != null) {
            next.handle(request);
        }
    }
}
