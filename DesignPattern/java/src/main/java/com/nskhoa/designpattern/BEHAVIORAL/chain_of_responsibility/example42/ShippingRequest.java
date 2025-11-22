package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example42;

public class ShippingRequest {
    private String address;
    private double packageWeight;
    boolean costsCalculated;
    private boolean pickupScheduled;

    public ShippingRequest(String address, double packageWeight) {
        this.address = address;
        this.packageWeight = packageWeight;
    }

    public String getAddress() {
        return address;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setCostsCalculated(boolean val) {
        costsCalculated = val;
    }

    public void setPickupScheduled(boolean val) {
        pickupScheduled = val;
    }
}
