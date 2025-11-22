package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example3;

// Client runner
public class ATMCashDispenserDemo {
    public static void main(String[] args) {
        CashDispenser hundred = new HundredDispenser();
        CashDispenser fifty = new FiftyDispenser();
        CashDispenser twenty = new TwentyDispenser();

        hundred.setNextDispenser(fifty);
        fifty.setNextDispenser(twenty);

        CashRequest request = new CashRequest(370);
        hundred.dispense(request);
    }
}

