package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example40;

public class ConfigureSettingsStep extends InstallStep {
    @Override
    public void execute(InstallRequest request) {
        if (request.isFilesCopied()) {
            System.out.println("Configuring settings...");
            request.setSettingsConfigured(true);
        }
        else {
            System.out.println("File copy step failed. Installation aborted.");
        }
    }
}
