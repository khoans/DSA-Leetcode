package com.nskhoa.designpattern.BEHAVIORAL.iterator.example38;

public class BugTracker {
    private final Bug[] bugs = new Bug[10];
    private int count = 0;

    void addBug(Bug b) {
        if (count < bugs.length) {
            bugs[count++] = b;
        }
    }

    MyIterator<Bug> createIterator() {
        return new BugIterator();
    }

    private class BugIterator implements MyIterator<Bug> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Bug next() {
            return bugs[index++];
        }
    }
}
