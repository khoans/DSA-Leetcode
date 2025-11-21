package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class EthereumWallet implements Wallet {
    public void balance(String address) {
        System.out.println("Ethereum Balance: " + address);
    }
}
