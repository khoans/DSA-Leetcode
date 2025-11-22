package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example52;

public class QuotaValidator extends ProvisioningHandler {
    @Override
    public void provision(ResourceRequest request) {
        if (request.getCpuQuota() <= 16 && request.getMemoryQuota() <= 64) {
            System.out.println("Quota validated.");
            if (nextHandler != null) {
                nextHandler.provision(request);
            }
        }
        else {
            System.out.println("Quota exceeded.");
        }
    }
}
