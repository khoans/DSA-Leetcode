package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example44;

public class StyleChecker extends CodeReviewHandler {
    @Override
    public void review(CodeChange code) {
        System.out.println("Style check passed.");
        if (nextHandler != null) {
            nextHandler.review(code);
        }
    }
}
