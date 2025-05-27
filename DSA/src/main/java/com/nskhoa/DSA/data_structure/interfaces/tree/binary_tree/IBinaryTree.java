package com.nskhoa.DSA.data_structure.interfaces.tree.binary_tree;

import com.nskhoa.DSA.data_structure.implementation.tree.binary_tree.binary_tree.BinaryTree;

public interface IBinaryTree {
    static void main(String[] args) {
        IBinaryTree bt = new BinaryTree(10);
        for (int i = 1; i < 12; i++) {
            bt.insert("con cu " + i);
        }
        bt.preOrder(3);
    }

    // isFull
    boolean isFull();

    void insert(String value);

    // preOrder Traversal
    void preOrder(int index);

    // InOrder Traversal
    void inOrder(int index);

    // Post Order Traversal
    void postOrder(int index);

    // Level Order Traversal
    void levelOrder();

    // Search method
    int search(String value);

    // Delete Method
    void delete(String value);

    void deleteBT();
}
