package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public interface BlockchainAbstractFactory {
    Wallet createWallet();

    Transaction createTransaction();
}
