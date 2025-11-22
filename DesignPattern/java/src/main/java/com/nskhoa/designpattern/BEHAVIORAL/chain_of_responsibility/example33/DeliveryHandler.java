package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example33;

public class DeliveryHandler extends CDNHandler {
    @Override
    public void handle(ContentRequest request) {
        System.out.println("Delivering content for " + request.getUrl());
    }
}
