package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example15;

public class Director extends WorkflowStep {
    @Override
    public void approve(WorkflowRequest request) {
        System.out.println("Director approved request for $" + request.getAmount());
    }
}
