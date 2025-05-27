package com.nskhoa.DSA.data_structure.interfaces.tree.binary_search_tree;

import com.nskhoa.DSA.data_structure.implementation.tree.binary_tree.binary_search_tree.BinaryNode;
import com.nskhoa.DSA.data_structure.implementation.tree.binary_tree.binary_search_tree.BinarySearchTree;

public interface IBinarySearchTree {
    // Minimum node
    static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    static void main(String[] args) {
        IBinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(7);
        binarySearchTree.insert(2);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(8);
        binarySearchTree.insert(1);
        binarySearchTree.insert(9);

        binarySearchTree.levelOrder();

    }

    // Insert Method
    BinaryNode insert(BinaryNode currentNode, int value);

    void insert(int value);

    void preOrder(BinaryNode node);

    // Inorder Traversal
    void inOrder(BinaryNode node);

    // PostOrder Traversal
    void postOrder(BinaryNode node);

    void levelOrder();

    // Search Method
    BinaryNode search(BinaryNode node, int value);

    // Delete node
    BinaryNode deleteNode(BinaryNode root, int value);

    void deleteBST();
}
