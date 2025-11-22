package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example3;

// Concrete Handlers
public class HundredDispenser extends CashDispenser {
    @Override
    public void dispense(CashRequest request) {
        int count = request.getAmount() / 100;
        int remainder = request.getAmount() % 100;

        if (count > 0) {
            System.out.println("Dispensing " + count + " hundred dollar note(s)");
        }
        if (remainder > 0 && nextDispenser != null) {
            request.setAmount(remainder);
            nextDispenser.dispense(request);
        } else if (remainder > 0) {
            System.out.println("Cannot dispense remaining amount: " + remainder);
        }
    }
}
