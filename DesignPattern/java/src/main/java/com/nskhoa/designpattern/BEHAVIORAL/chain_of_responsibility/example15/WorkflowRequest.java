package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example15;

// Request class
public class WorkflowRequest {
    private int amount;

    public WorkflowRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
