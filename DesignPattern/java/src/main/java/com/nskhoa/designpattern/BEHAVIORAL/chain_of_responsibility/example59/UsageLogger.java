package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example59;

public class UsageLogger extends DRMHandler {
    @Override
    public void handle(ContentRequest request) {
        System.out.println("Usage logged for user " + request.getUserId());
    }
}
