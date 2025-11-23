package com.nskhoa.designpattern.BEHAVIORAL.iterator.example22;

public class Product {
    private final String name;
    private final double price;

    Product(String name, double price) {
        this.name = name; this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
