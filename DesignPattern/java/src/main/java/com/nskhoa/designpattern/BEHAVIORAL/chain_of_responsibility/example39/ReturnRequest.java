package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example39;

// Request class
public class ReturnRequest {
    private String orderId;
    private boolean eligible;
    private boolean refundProcessed;
    private boolean inventoryUpdated;

    public ReturnRequest(String orderId, boolean eligible) {
        this.orderId = orderId;
        this.eligible = eligible;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setRefundProcessed(boolean val) {
        refundProcessed = val;
    }

    public void setInventoryUpdated(boolean val) {
        inventoryUpdated = val;
    }
}
