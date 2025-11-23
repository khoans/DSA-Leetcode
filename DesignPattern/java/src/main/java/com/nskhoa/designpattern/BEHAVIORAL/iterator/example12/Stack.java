package com.nskhoa.designpattern.BEHAVIORAL.iterator.example12;

public class Stack<T> {
    private final Object[] elements;
    private int top = -1;

    Stack(int capacity) {
        elements = new Object[capacity];
    }

    void push(T element) {
        if (top < elements.length - 1) {
            elements[++top] = element;
        }
    }

    T pop() {
        if (top >= 0) {
            return (T) elements[top--];
        }
        return null;
    }

    MyIterator<T> createIterator() {
        return new StackIterator();
    }

    private class StackIterator implements MyIterator<T> {
        private int current = top;

        public boolean hasNext() {
            return current >= 0;
        }

        public T next() {
            return (T) elements[current--];
        }
    }
}
