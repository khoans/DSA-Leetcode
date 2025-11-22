package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example41;

public class LoggingHandler extends NetworkRequestHandler {
    @Override
    public void handle(NetworkRequest request) {
        System.out.println("Logging request for URL: " + request.getUrl());
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
