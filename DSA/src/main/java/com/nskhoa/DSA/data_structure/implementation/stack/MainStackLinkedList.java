package com.nskhoa.DSA.data_structure.implementation.stack;

public class MainStackLinkedList {
    public static void main(String[] args) {
        StackLinkedList newStack = new StackLinkedList();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        newStack.deleteStack();


        StackArray newStackArray = new StackArray(5);
        newStackArray.push(1);
        newStackArray.push(2);
        newStackArray.push(3);
        newStackArray.push(4);
        newStackArray.push(5);
        
    }

}
