package com.nskhoa.DSA.data_structure.implementation.linked_list.circular_singly_linked_list;


import com.nskhoa.DSA.data_structure.interfaces.linked_list.ICircularSinglyLinkedList;

public class MainCircularLinkedList {
    public static void main(String[] args) {
        ICircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 1);
        csll.insertCSLL(7, 8);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();

    }
}
