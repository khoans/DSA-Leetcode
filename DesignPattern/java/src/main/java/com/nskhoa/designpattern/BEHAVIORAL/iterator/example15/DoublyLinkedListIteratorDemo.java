package com.nskhoa.designpattern.BEHAVIORAL.iterator.example15;

public class DoublyLinkedListIteratorDemo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        MyIterator<Integer> it = list.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

