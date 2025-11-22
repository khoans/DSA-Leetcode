package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example53;

public class ConfirmationSender extends BookingHandler {
    @Override
    public void handle(BookingRequest request) {
        if (request.paymentDone) {
            System.out.println("Booking confirmed and notification sent.");
            request.setConfirmed(true);
        }
        else {
            System.out.println("Payment not processed. Cannot confirm booking.");
        }
    }
}
