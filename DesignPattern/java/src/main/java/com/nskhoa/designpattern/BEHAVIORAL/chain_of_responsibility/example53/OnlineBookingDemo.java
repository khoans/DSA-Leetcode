package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example53;

public class OnlineBookingDemo {
    public static void main(String[] args) {
        BookingHandler availabilityChecker = new AvailabilityChecker();
        BookingHandler paymentProcessor = new PaymentProcessor();
        BookingHandler confirmationSender = new ConfirmationSender();

        availabilityChecker.setNextHandler(paymentProcessor);
        paymentProcessor.setNextHandler(confirmationSender);

        BookingRequest request = new BookingRequest(true);
        availabilityChecker.handle(request);
    }
}
