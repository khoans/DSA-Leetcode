package com.nskhoa.DSA.data_structure.implementation.linked_list.singly_linked_list;

import data_structure.interfaces.linked_list.ISinglyLinkedList;

class MainSinglyLinkedList {
    public static void main(String[] args) {
        ISinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 0);
        sLL.traverseSinglyLinkedList();
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();

    }
}
