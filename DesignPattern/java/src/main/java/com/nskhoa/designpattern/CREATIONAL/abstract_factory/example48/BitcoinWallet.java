package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example48;

public class BitcoinWallet implements Wallet {
    public void balance(String address) {
        System.out.println("Bitcoin Balance: " + address);
    }
}
