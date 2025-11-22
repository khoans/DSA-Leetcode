package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example15;

public class Manager extends WorkflowStep {
    @Override
    public void approve(WorkflowRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved request for $" + request.getAmount());
        }
        else if (nextStep != null) {
            nextStep.approve(request);
        }
    }
}
