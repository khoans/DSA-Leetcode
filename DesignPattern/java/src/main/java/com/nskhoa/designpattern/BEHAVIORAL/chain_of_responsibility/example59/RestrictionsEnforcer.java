package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example59;

public class RestrictionsEnforcer extends DRMHandler {
    @Override
    public void handle(ContentRequest request) {
        System.out.println("Restrictions enforced for user " + request.getUserId());
        request.setRestrictionsEnforced(true);
        if (nextHandler != null) nextHandler.handle(request);
    }
}
