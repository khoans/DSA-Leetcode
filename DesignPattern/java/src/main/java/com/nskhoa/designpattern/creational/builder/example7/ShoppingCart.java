package com.nskhoa.designpattern.creational.builder.example7;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> products = new ArrayList<>();
    private int quantity;
    private String discount;

    private ShoppingCart(Builder builder) {
        this.products.addAll(builder.products); this.quantity = builder.quantity; this.discount = builder.discount;
    }

    public static class Builder {
        private List<String> products = new ArrayList<>();
        private int quantity;
        private String discount;

        public Builder addProduct(String p) {
            products.add(p); return this;
        }

        public Builder quantity(int q) {
            this.quantity = q; return this;
        }

        public Builder discount(String d) {
            this.discount = d; return this;
        }

        public ShoppingCart build() {
            return new ShoppingCart(this);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart.Builder()
                .addProduct("Laptop")
                .addProduct("Mouse")
                .quantity(2)
                .discount("SUMMER21")
                .build();
        System.out.println("Shopping Cart:");
        System.out.println("Products: " + cart.products);
        System.out.println("Quantity: " + cart.quantity);
        System.out.println("Discount: " + cart.discount);
    }
}
