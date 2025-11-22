package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example52;

public class SettingsConfigurator extends ProvisioningHandler {
    @Override
    public void provision(ResourceRequest request) {
        if (request.allocated) {
            System.out.println("Settings configured.");
            request.setConfigured(true);
        }
        else {
            System.out.println("Allocation failed. Cannot configure.");
        }
    }
}
