package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class BitcoinFactory implements BlockchainAbstractFactory {
    public Wallet createWallet() {
        return new BitcoinWallet();
    }

    public Transaction createTransaction() {
        return new BitcoinTransaction();
    }
}
