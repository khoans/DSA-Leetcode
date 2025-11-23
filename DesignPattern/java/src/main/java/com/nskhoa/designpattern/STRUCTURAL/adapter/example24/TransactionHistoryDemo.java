package com.nskhoa.designpattern.STRUCTURAL.adapter.example24;

public class TransactionHistoryDemo {
    public static void main(String[] args) {
        TransactionHistory history = new TransactionHistory();
        history.addTransaction(new Transaction("T001", 120.50));
        history.addTransaction(new Transaction("T002", -35.00));

        MyIterator<Transaction> it = history.createIterator();
        while (it.hasNext()) {
            Transaction t = it.next();
            System.out.println(t.getId() + ": $" + t.getAmount());
        }
    }
}

