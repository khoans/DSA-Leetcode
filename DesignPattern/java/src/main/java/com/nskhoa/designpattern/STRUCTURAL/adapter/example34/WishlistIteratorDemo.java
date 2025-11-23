package com.nskhoa.designpattern.STRUCTURAL.adapter.example34;

public class WishlistIteratorDemo {
    public static void main(String[] args) {
        Wishlist list = new Wishlist();
        list.addItem(new WishlistItem("Smartphone"));
        list.addItem(new WishlistItem("Watch"));

        MyIterator<WishlistItem> it = list.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getName());
        }
    }
}

