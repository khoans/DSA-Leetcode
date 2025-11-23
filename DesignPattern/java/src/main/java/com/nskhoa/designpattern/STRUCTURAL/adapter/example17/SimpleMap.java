package com.nskhoa.designpattern.STRUCTURAL.adapter.example17;

public class SimpleMap {
    private final KeyValue[] entries = new KeyValue[10];
    private int count = 0;

    void put(String key, String value) {
        if (count < entries.length) {
            entries[count++] = new KeyValue(key, value);
        }
    }

    MyIterator<KeyValue> createIterator() {
        return new MapIterator();
    }

    private class MapIterator implements MyIterator<KeyValue> {
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public KeyValue next() {
            return entries[index++];
        }
    }
}
