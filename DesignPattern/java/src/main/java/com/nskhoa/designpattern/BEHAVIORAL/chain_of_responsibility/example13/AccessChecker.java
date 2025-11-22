package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example13;

// Abstract Handler
public abstract class AccessChecker {
    protected AccessChecker next;

    public void setNext(AccessChecker next) {
        this.next = next;
    }

    public abstract void checkAccess(AccessRequest request);
}
