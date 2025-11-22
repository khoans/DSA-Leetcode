package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example44;

public class PerformanceChecker extends CodeReviewHandler {
    @Override
    public void review(CodeChange code) {
        System.out.println("Performance issues checked.");
    }
}
