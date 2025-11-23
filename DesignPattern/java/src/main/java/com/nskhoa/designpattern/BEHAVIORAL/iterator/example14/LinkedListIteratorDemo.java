package com.nskhoa.designpattern.BEHAVIORAL.iterator.example14;

public class LinkedListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        MyIterator<String> it = list.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

