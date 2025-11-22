package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example3;

public class FiftyDispenser extends CashDispenser {
    @Override
    public void dispense(CashRequest request) {
        int count = request.getAmount() / 50;
        int remainder = request.getAmount() % 50;

        if (count > 0) {
            System.out.println("Dispensing " + count + " fifty dollar note(s)");
        }
        if (remainder > 0 && nextDispenser != null) {
            request.setAmount(remainder);
            nextDispenser.dispense(request);
        } else if (remainder > 0) {
            System.out.println("Cannot dispense remaining amount: " + remainder);
        }
    }
}
