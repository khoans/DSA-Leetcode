package com.nskhoa.DSA.data_structure.interfaces.tree.binary_tree;

import com.nskhoa.DSA.data_structure.implementation.tree.binary_tree.binary_tree.BinaryNode;

public interface IBinaryTreeLL {
    // PreOrder Traversal
    void preOrder(BinaryNode node);

    void inOrder(BinaryNode node);

    // Post Order Traversal
    void postOrder(BinaryNode node);

    // Level Order
    void levelOrder();

    // Search Method
    void search(String value);

    // Insert Method
    void insert(String value);

    // Get Deepest node
    BinaryNode getDeepestNode();

    // Delete Deepest node
    void deleteDeepestNode();

    // Delete Given node
    void deleteNode(String value);

    // Delete Binary Tree
    void deleteBT();
}
