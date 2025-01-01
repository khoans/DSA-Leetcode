package com.nskhoa.DSA.data_structure.implementation.linked_list.circular_doubly_linked_list;

import com.nskhoa.DSA.data_structure.interfaces.linked_list.ICircularDoublyLinkedList;

public class MainCircularDoublyLinkedList {
    public static void main(String[] args) {
        ICircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2, 0);
        cdll.insertNode(3, 2);
        cdll.insertNode(4, 5);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
