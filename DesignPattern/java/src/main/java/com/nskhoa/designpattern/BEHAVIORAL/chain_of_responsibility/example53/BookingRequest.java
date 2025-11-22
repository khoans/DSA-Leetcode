package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example53;

public class BookingRequest {
    private boolean available;
    boolean paymentDone;
    private boolean confirmed;

    public BookingRequest(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setPaymentDone(boolean val) {
        paymentDone = val;
    }

    public void setConfirmed(boolean val) {
        confirmed = val;
    }
}
