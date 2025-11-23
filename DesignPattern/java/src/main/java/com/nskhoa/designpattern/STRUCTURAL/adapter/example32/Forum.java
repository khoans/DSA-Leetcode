package com.nskhoa.designpattern.STRUCTURAL.adapter.example32;

public class Forum {
    private final Thread[] threads = new Thread[10];
    private int count = 0;

    void addThread(Thread t) {
        if (count < threads.length) {
            threads[count++] = t;
        }
    }

    MyIterator<Thread> createIterator() {
        return new ForumIterator();
    }

    private class ForumIterator implements MyIterator<Thread> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Thread next() {
            return threads[index++];
        }
    }
}
