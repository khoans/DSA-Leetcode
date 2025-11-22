package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example40;

// Concrete Handlers
public class SystemCheckStep extends InstallStep {
    @Override
    public void execute(InstallRequest request) {
        System.out.println("Checking system requirements...");
        request.setSystemChecked(true);
        if (nextStep != null) {
            nextStep.execute(request);
        }
    }
}
