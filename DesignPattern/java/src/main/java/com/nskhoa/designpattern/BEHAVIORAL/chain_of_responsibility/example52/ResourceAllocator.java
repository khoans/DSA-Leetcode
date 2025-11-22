package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example52;

public class ResourceAllocator extends ProvisioningHandler {
    @Override
    public void provision(ResourceRequest request) {
        System.out.println("Resources allocated.");
        request.setAllocated(true);
        if (nextHandler != null) {
            nextHandler.provision(request);
        }
    }
}
