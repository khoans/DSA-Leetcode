package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example36;

public class PolicyModerator extends ContentModerator {
    @Override
    public void moderate(UserContent content) {
        System.out.println("Content passed all checks. Approved.");
    }
}
