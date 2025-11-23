package com.nskhoa.designpattern.BEHAVIORAL.iterator.example24;

public class TransactionHistory {
    private final Transaction[] transactions = new Transaction[10];
    private int count = 0;

    void addTransaction(Transaction t) {
        if (count < transactions.length) {
            transactions[count++] = t;
        }
    }

    MyIterator<Transaction> createIterator() {
        return new TransactionIterator();
    }

    private class TransactionIterator implements MyIterator<Transaction> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Transaction next() {
            return transactions[index++];
        }
    }
}
