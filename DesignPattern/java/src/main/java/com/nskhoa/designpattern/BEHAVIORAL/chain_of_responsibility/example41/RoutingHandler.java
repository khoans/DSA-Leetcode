package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example41;

public class RoutingHandler extends NetworkRequestHandler {
    @Override
    public void handle(NetworkRequest request) {
        System.out.println("Routing request to service for URL: " + request.getUrl());
    }
}
