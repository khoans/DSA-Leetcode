package com.nskhoa.designpattern.STRUCTURAL.bridge.example18;

public class BridgePatternExample18 {
    public static void main(String[] args) {
        FinanceClient mobileUIBankA = new MobileFinanceClient(new BankAProcessor());
        mobileUIBankA.executeTransaction("TXN12345");

        FinanceClient webUIBankB = new WebFinanceClient(new BankBProcessor());
        webUIBankB.executeTransaction("TXN67890");
    }
}
