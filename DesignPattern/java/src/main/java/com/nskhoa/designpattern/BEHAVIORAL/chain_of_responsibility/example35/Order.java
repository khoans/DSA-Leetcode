package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example35;

// Request class
public class Order {
    private String id;
    private boolean inventoryChecked;
    private boolean paymentProcessed;
    private boolean packaged;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setInventoryChecked(boolean val) {
        inventoryChecked = val;
    }

    public void setPaymentProcessed(boolean val) {
        paymentProcessed = val;
    }

    public void setPackaged(boolean val) {
        packaged = val;
    }
}
