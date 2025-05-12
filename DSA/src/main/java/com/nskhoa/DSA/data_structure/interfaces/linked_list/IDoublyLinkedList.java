package com.nskhoa.DSA.data_structure.interfaces.linked_list;


import com.nskhoa.DSA.data_structure.implementation.linked_list.doubly_linked_list.DoublyNode;

public interface IDoublyLinkedList
{
    DoublyNode createDLL(int nodeValue);

    // Insertion Method
    void insertDLL(int nodeValue, int location);

    //Traverse DLL
    void traverseDLL();

    // Reverse Traverse
    void reverseTraverseDLL();

    // Search Node
    boolean searchNode(int nodeValue);

    // Deletion Method
    void deleteNodeDLL(int location);

    // Delete entire DLL
    void deleteDLL();
}
