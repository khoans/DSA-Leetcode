package com.nskhoa.designpattern.STRUCTURAL.adapter.example13;

public class QueueIteratorDemo {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        MyIterator<String> it = queue.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

