package com.nskhoa.DSA.data_structure.interfaces.tree.binary_heap;

public interface IBinaryHeap {
    boolean isEmpty();

    Integer peek();

    int sizeOfBP();

    void levelOrder();

    // Heapify for Insert
    void heapifyBottomToTop(int index, String heapType);

    void insert(int value, String typeHeap);

    // heapifyTopToBottom
    void heapifyTopToBottom(int index, String heapType);

    int extractHeadOfBP(String heapType);

    // delete
    void deleteBH();
}
