package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example1;

// Abstract Handler
public abstract class LeaveApprover {
    protected LeaveApprover nextApprover;

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(LeaveRequest request);
}
