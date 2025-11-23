package com.nskhoa.designpattern.BEHAVIORAL.iterator.example3;

public class ShoppingCart {
    private final CartItem[] items = new CartItem[10];
    private int count = 0;

    void addItem(CartItem item) { if (count < items.length) items[count++] = item; }

    MyIterator<CartItem> createIterator() { return new CartItemIterator(); }

    private class CartItemIterator implements MyIterator<CartItem> {
        private int index = 0;

        public boolean hasNext() { return index < count; }
        public CartItem next() { return items[index++]; }
    }
}
