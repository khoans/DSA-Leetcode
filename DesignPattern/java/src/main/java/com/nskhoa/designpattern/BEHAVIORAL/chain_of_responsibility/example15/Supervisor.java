package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example15;

// Concrete Handlers
public class Supervisor extends WorkflowStep {
    @Override
    public void approve(WorkflowRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Supervisor approved request for $" + request.getAmount());
        }
        else if (nextStep != null) {
            nextStep.approve(request);
        }
    }
}
