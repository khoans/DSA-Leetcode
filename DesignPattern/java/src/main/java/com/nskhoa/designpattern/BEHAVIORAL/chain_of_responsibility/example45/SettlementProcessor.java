package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example45;

public class SettlementProcessor extends TransactionProcessor {
    @Override
    public void process(Transaction transaction) {
        System.out.println("Transaction settled for amount: " + transaction.getAmount());
    }
}
