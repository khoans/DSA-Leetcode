package com.nskhoa.designpattern.BEHAVIORAL.iterator.example3;

public class CartItem {
    private final String name;
    private final double price;

    CartItem(String name, double price) { this.name = name; this.price = price; }
    String getName() { return name; }
    double getPrice() { return price; }
}
