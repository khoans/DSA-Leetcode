package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example53;

public class AvailabilityChecker extends BookingHandler {
    @Override
    public void handle(BookingRequest request) {
        if (request.isAvailable()) {
            System.out.println("Availability confirmed.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        }
        else {
            System.out.println("Item not available.");
        }
    }
}
