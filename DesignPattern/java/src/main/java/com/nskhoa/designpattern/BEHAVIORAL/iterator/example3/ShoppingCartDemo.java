package com.nskhoa.designpattern.BEHAVIORAL.iterator.example3;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 1200));
        cart.addItem(new CartItem("Mouse", 30));

        MyIterator<CartItem> it = cart.createIterator();
        while (it.hasNext()) {
            CartItem item = it.next();
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }
}

