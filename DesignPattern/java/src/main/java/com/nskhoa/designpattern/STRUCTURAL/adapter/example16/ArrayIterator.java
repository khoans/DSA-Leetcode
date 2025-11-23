package com.nskhoa.designpattern.STRUCTURAL.adapter.example16;

public class ArrayIterator<T> {
    private final T[] array;

    ArrayIterator(T[] array) {
        this.array = array;
    }

    MyIterator<T> createIterator() {
        return new Iterator();
    }

    private class Iterator implements MyIterator<T> {
        private int index = 0;

        public boolean hasNext() {
            return index < array.length;
        }

        public T next() {
            return array[index++];
        }
    }
}
