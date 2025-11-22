package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example33;

// Concrete Handlers
public class CachingHandler extends CDNHandler {
    @Override
    public void handle(ContentRequest request) {
        System.out.println("Checking cache for " + request.getUrl());
        request.setCached(true);
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
