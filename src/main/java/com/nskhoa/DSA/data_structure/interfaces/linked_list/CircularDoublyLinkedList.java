package com.nskhoa.DSA.data_structure.interfaces.linked_list;


import com.nskhoa.DSA.data_structure.implementation.linked_list.circular_doubly_linked_list.DoublyNode;

public interface ICircularDoublyLinkedList
{
    // Create CDLL
    DoublyNode createCDLL(int nodeValue);

    // Insertion Method
    void insertNode(int nodeValue, int location);

    // Traverse CDLL
    void traverseCDLL();

    // Reverse Traversal
    void reverseTraversalCDLL();

    // Search for a Node
    boolean searchNode(int nodeValue);

    // Deletion Method
    void deleteNode(int location);

    // Delete Entire CDLL
    void deleteCDLL();
}
