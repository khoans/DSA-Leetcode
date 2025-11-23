package com.nskhoa.designpattern.BEHAVIORAL.iterator.example15;

public class DoublyLinkedListNode<T> {
    T data;
    DoublyLinkedListNode<T> next;
    DoublyLinkedListNode<T> prev;

    DoublyLinkedListNode(T data) {
        this.data = data;
    }
}
