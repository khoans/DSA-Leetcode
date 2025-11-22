package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example40;

public class FileCopyStep extends InstallStep {
    @Override
    public void execute(InstallRequest request) {
        if (request.isSystemChecked()) {
            System.out.println("Copying installation files...");
            request.setFilesCopied(true);
            if (nextStep != null) {
                nextStep.execute(request);
            }
        }
        else {
            System.out.println("System check failed. Installation aborted.");
        }
    }
}
