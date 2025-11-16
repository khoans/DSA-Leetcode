package com.nskhoa.designpattern.creational.singleton.example8;

public class FriendsSavings {
    private static FriendsSavings instance;
    private double total = 0;

    private FriendsSavings() {
    }

    public static FriendsSavings getInstance() {
        if (instance == null) {
            instance = new FriendsSavings();
        }
        return instance;
    }

    public void contribute(double amount) {
        total += amount;
    }

    public double getTotal() {
        return total;
    }

    public static void main(String[] args) {
        FriendsSavings savings = FriendsSavings.getInstance();
        savings.contribute(100.0);
        savings.contribute(150.0);
        savings.contribute(200.0);

        System.out.println("Total Friends' Savings: $" + savings.getTotal());
    }
}
