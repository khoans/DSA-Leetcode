package com.nskhoa.DSA.data_structure.implementation.linked_list.doubly_linked_list;

import data_structure.interfaces.linked_list.IDoublyLinkedList;

public class MainDoublyLinkedList {
    public static void main(String[] args) {
        IDoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
