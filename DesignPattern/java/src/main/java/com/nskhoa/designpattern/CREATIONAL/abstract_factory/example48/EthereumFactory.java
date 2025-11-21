package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class EthereumFactory implements BlockchainAbstractFactory {
    public Wallet createWallet() {
        return new EthereumWallet();
    }

    public Transaction createTransaction() {
        return new EthereumTransaction();
    }
}
