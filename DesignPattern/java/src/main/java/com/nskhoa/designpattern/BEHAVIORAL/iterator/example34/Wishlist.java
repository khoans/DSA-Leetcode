package com.nskhoa.designpattern.BEHAVIORAL.iterator.example34;

public class Wishlist {
    private final WishlistItem[] items = new WishlistItem[10];
    private int count = 0;

    void addItem(WishlistItem item) {
        if (count < items.length) {
            items[count++] = item;
        }
    }

    MyIterator<WishlistItem> createIterator() {
        return new WishlistIterator();
    }

    private class WishlistIterator implements MyIterator<WishlistItem> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public WishlistItem next() {
            return items[index++];
        }
    }
}
