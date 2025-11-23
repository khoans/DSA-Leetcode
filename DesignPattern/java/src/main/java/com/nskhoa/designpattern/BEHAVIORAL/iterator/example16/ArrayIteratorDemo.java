package com.nskhoa.designpattern.BEHAVIORAL.iterator.example16;

public class ArrayIteratorDemo {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "cherry"};
        ArrayIterator<String> arrayIterator = new ArrayIterator<>(data);

        MyIterator<String> it = arrayIterator.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

