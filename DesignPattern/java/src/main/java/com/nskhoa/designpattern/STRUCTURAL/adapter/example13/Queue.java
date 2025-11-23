package com.nskhoa.designpattern.STRUCTURAL.adapter.example13;

public class Queue<T> {
    private final Object[] elements;
    private int front = 0;
    private int rear = 0;
    private final int capacity;

    Queue(int capacity) {
        this.capacity = capacity + 1; // One slot for empty/full distinction
        this.elements = new Object[this.capacity];
    }

    boolean enqueue(T element) {
        int nextRear = (rear + 1) % capacity;
        if (nextRear != front) {
            elements[rear] = element;
            rear = nextRear;
            return true;
        }
        return false;
    }

    T dequeue() {
        if (front == rear) {
            return null;
        }
        T element = (T) elements[front];
        front = (front + 1) % capacity;
        return element;
    }

    MyIterator<T> createIterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements MyIterator<T> {
        private int index = front;

        public boolean hasNext() {
            return index != rear;
        }

        public T next() {
            T element = (T) elements[index];
            index = (index + 1) % capacity;
            return element;
        }
    }
}
