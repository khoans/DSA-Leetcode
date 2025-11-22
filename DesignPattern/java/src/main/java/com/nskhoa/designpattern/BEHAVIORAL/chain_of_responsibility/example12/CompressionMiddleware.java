package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example12;

public class CompressionMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        System.out.println("Compressing response for URL: " + request.getUrl());
    }
}
