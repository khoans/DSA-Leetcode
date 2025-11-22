package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example40;

// Client runner
public class InstallationWizardDemo {
    public static void main(String[] args) {
        InstallStep systemCheck = new SystemCheckStep();
        InstallStep fileCopy = new FileCopyStep();
        InstallStep configure = new ConfigureSettingsStep();

        systemCheck.setNextStep(fileCopy);
        fileCopy.setNextStep(configure);

        InstallRequest request = new InstallRequest();
        systemCheck.execute(request);
    }
}

