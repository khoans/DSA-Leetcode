package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example3;

public class TwentyDispenser extends CashDispenser {
    @Override
    public void dispense(CashRequest request) {
        int count = request.getAmount() / 20;
        int remainder = request.getAmount() % 20;

        if (count > 0) {
            System.out.println("Dispensing " + count + " twenty dollar note(s)");
        }
        if (remainder > 0) {
            System.out.println("Cannot dispense remaining amount: " + remainder);
        }
    }
}
