package com.nskhoa.DSA.data_structure.interfaces.linked_list;


import com.nskhoa.DSA.data_structure.implementation.linked_list.singly_linked_list.Node;

public interface ISinglyLinkedList
{
    Node createSinglyLinkedList(int nodeValue);

    // Insert Method SinglyLinkedList
    void insertInLinkedList(int nodeValue, int location);

    // SinglyLinkedList Traversal
    void traverseSinglyLinkedList();

    boolean searchNode(int nodeValue);

    //Deleting a node from SinglyLinkedList
    void deletionOfNode(int location);

    //  Delete Entire SinglyLinkedList
    void deleteSLL();
}
