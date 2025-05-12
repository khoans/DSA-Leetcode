package com.nskhoa.DSA.data_structure.implementation.tree.binary_tree;


public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Blank Tree of size " +size+ " has been created");
    }

    // isFull
    boolean isFull() {
        if (arr.length-1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // insert method

    void insert( String value) {
        if (!isFull()) {
            arr[lastUsedIndex+1] =value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted");
        } else {
            System.out.println("The BT is full");
        }
    }

    // preOrder Traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index]+ " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    // InOrder Traversal
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);

    }

    // Post Order Traversal
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.print(arr[index] + " ");
    }

    // Level Order Traversal
    public void levelOrder() {
        for (int i = 1; i<=lastUsedIndex; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    // Search method
    public int search(String value) {
        for (int i = 1; i<=lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println(value+" exists at the location: " + i);
                return i;
            }
        }
        System.out.println("The value does not exist in BT");
        return -1;
    }

    // Delete Method
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node successfully deleted");
        }
    }

    // Delete BT

    public void deleteBT() {
        try {
            arr = null;
            System.out.println("The BT has been successfully deleted");

        } catch (Exception e){
            System.out.println("There was an error deleting the tree");
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(10);
        for (int i = 1 ; i < 12; i++) {
            bt.insert("con cu " + i);
        }
        bt.preOrder(3);
    }
}

/**
 * 1. Pre-order Traversal
 * In pre-order traversal, the nodes are visited in the following order:
 *
 * Visit the current node.
 *
 * Recursively visit the left subtree.
 *
 * Recursively visit the right subtree.
 *
 * In the provided code, the preOrder method follows this logic by first printing the node, then recursively calling preOrder on the left child (index * 2) and then on the right child (index * 2 + 1).
 *
 * Example: For a binary tree like this:
 *
 * mathematica
 * Copy
 *        A
 *      /   \
 *     B     C
 *    / \   / \
 *   D   E F   G
 * The pre-order traversal would be: A, B, D, E, C, F, G
 *
 * 2. In-order Traversal
 * In in-order traversal, the nodes are visited in the following order:
 *
 * Recursively visit the left subtree.
 *
 * Visit the current node.
 *
 * Recursively visit the right subtree.
 *
 * In the provided code, the inOrder method first recursively calls inOrder on the left child, then prints the node, and finally recursively calls inOrder on the right child.
 *
 * Example: For the same tree:
 *
 * mathematica
 * Copy
 *        A
 *      /   \
 *     B     C
 *    / \   / \
 *   D   E F   G
 * The in-order traversal would be: D, B, E, A, F, C, G
 *
 * 3. Post-order Traversal
 * In post-order traversal, the nodes are visited in the following order:
 *
 * Recursively visit the left subtree.
 *
 * Recursively visit the right subtree.
 *
 * Visit the current node.
 *
 * In the provided code, the postOrder method first recursively calls postOrder on the left child and right child, and then prints the node.
 *
 * Example: For the same tree:
 *
 * mathematica
 * Copy
 *        A
 *      /   \
 *     B     C
 *    / \   / \
 *   D   E F   G
 * The post-order traversal would be: D, E, B, F, G, C, A
 *
 * 4. Level-order Traversal
 * Level-order traversal (also known as breadth-first traversal) visits the nodes level by level, from top to bottom, left to right. It is implemented using a queue in most cases. In your levelOrder method, it loops through the array and prints the nodes at each level from left to right.
 *
 * Example: For the same tree:
 *
 * mathematica
 * Copy
 *        A
 *      /   \
 *     B     C
 *    / \   / \
 *   D   E F   G
 * The level-order traversal would be: A, B, C, D, E, F, G
 *
 * Summary of Traversals:
 * Pre-order: Root → Left → Right
 *
 * In-order: Left → Root → Right
 *
 * Post-order: Left → Right → Root
 *
 * Level-order: Visit level by level from top to bottom.
 */

