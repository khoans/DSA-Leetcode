package com.nskhoa.designpattern.BEHAVIORAL.iterator.example14;

public class LinkedList<T> {
    private LinkedListNode<T> head;

    void add(T data) {
        if (head == null) {
            head = new LinkedListNode<>(data);
        }
        else {
            LinkedListNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new LinkedListNode<>(data);
        }
    }

    MyIterator<T> createIterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements MyIterator<T> {
        private LinkedListNode<T> current = head;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
