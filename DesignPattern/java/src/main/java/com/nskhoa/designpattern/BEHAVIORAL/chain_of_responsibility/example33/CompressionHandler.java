package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example33;

public class CompressionHandler extends CDNHandler {
    @Override
    public void handle(ContentRequest request) {
        if (!request.isCompressed()) {
            System.out.println("Compressing content for " + request.getUrl());
            request.setCompressed(true);
        }
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
