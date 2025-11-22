package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example14;

// Request class
public class Order {
    private double price;
    private double discount = 0;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void addDiscount(double discount) {
        this.discount += discount;
    }
}
