package com.nskhoa.designpattern.creational.singleton.example4;

public class BankAccount {
    private static BankAccount instance;
    private double balance;

    private BankAccount() {
        balance = 5000.0;
    }

    public static BankAccount getInstance() {
        if (instance == null) {
            instance = new BankAccount();
        }
        return instance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = BankAccount.getInstance();
        System.out.println("Initial Balance: $" + account.getBalance());
        account.deposit(1500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());
    }
}
