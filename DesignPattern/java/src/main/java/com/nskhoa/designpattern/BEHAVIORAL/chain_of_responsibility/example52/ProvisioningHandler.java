package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example52;

public abstract class ProvisioningHandler {
    protected ProvisioningHandler nextHandler;

    public void setNextHandler(ProvisioningHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void provision(ResourceRequest request);
}
