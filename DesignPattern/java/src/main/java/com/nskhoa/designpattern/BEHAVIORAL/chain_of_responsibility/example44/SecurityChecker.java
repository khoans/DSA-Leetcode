package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example44;

public class SecurityChecker extends CodeReviewHandler {
    @Override
    public void review(CodeChange code) {
        System.out.println("Security vulnerabilities checked.");
        if (nextHandler != null) {
            nextHandler.review(code);
        }
    }
}
