package com.nskhoa.designpattern.BEHAVIORAL.iterator.example15;

public class DoublyLinkedList<T> {
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;

    void add(T data) {
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(data);
        if (head == null) {
            head = tail = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    MyIterator<T> createIterator() {
        return new ForwardIterator();
    }

    private class ForwardIterator implements MyIterator<T> {
        private DoublyLinkedListNode<T> current = head;

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
