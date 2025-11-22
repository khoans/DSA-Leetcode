package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example45;

public class TransactionProcessingDemo {
    public static void main(String[] args) {
        TransactionProcessor fraud = new FraudDetector();
        TransactionProcessor compliance = new ComplianceChecker();
        TransactionProcessor settlement = new SettlementProcessor();

        fraud.setNextProcessor(compliance);
        compliance.setNextProcessor(settlement);

        Transaction t = new Transaction(1000, false, true);
        fraud.process(t);
    }
}

