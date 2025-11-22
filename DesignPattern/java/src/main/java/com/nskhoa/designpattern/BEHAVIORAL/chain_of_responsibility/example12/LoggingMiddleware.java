package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example12;

// Concrete Handlers
public class LoggingMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        System.out.println("Logging request for URL: " + request.getUrl());
        if (next != null) {
            next.handle(request);
        }
    }
}
