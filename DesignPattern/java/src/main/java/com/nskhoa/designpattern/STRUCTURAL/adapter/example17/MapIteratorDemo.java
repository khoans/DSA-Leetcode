package com.nskhoa.designpattern.STRUCTURAL.adapter.example17;

public class MapIteratorDemo {
    public static void main(String[] args) {
        SimpleMap map = new SimpleMap();
        map.put("apple", "red");
        map.put("banana", "yellow");

        MyIterator<KeyValue> it = map.createIterator();
        while (it.hasNext()) {
            KeyValue kv = it.next();
            System.out.println(kv.key + " => " + kv.value);
        }
    }
}

