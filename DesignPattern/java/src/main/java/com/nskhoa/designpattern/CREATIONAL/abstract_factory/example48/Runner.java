package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class Runner {
    public static void main(String[] args) {
        BlockchainAbstractFactory factory = new EthereumFactory();
        Wallet wallet = factory.createWallet();
        Transaction transaction = factory.createTransaction();

        wallet.balance("0x123");
        transaction.send("0x456", 10.5);
    }
}
