package com.nskhoa.DSA.data_structure.interfaces.linked_list;

import data_structure.implementation.linked_list.circular_singly_linked_list.Node;

public interface ICircularSinglyLinkedList
{
    Node createCSLL(int nodeValue);

    //  Insertion Method
    void insertCSLL(int nodeValue, int location);

    // Traversal Method
    void traverseCSLL();

    boolean searchNode(int nodeValue);

    void deleteNode(int location);

    // Delete CSLL
    void deleteCSLL();
}
