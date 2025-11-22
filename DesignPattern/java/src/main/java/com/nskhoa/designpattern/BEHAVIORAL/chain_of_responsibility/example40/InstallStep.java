package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example40;

// Abstract Handler
public abstract class InstallStep {
    protected InstallStep nextStep;

    public void setNextStep(InstallStep nextStep) {
        this.nextStep = nextStep;
    }

    public abstract void execute(InstallRequest request);
}
