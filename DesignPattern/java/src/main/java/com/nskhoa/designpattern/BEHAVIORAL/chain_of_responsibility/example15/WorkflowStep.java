package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example15;

// Abstract Handler
public abstract class WorkflowStep {
    protected WorkflowStep nextStep;

    public void setNextStep(WorkflowStep nextStep) {
        this.nextStep = nextStep;
    }

    public abstract void approve(WorkflowRequest request);
}
