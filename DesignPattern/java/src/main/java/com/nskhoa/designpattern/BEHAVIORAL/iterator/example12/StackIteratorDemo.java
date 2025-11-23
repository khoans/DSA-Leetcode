package com.nskhoa.designpattern.BEHAVIORAL.iterator.example12;

public class StackIteratorDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        MyIterator<Integer> it = stack.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

