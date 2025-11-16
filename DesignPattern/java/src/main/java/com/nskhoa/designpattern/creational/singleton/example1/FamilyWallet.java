package com.nskhoa.designpattern.CREATIONAL.singleton.example1;

public class FamilyWallet {
    private static FamilyWallet instance;
    private double balance = 1000.0;

    private FamilyWallet() {
    }

    public static synchronized FamilyWallet getInstance() {
        if (instance == null) {
            instance = new FamilyWallet();
        }
        return instance;
    }

    public void spend(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        FamilyWallet wallet = FamilyWallet.getInstance();
        System.out.println("Initial Balance: $" + wallet.getBalance());
        wallet.spend(150.0);
        System.out.println("Balance after spending $150: $" + wallet.getBalance());
    }
}

// Sử dụng: FamilyWallet wallet = FamilyWallet.getInstance(); wallet.spend(100);

