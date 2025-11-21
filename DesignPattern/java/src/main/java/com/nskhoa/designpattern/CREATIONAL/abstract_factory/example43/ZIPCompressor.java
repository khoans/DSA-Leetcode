package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public class ZIPCompressor implements Compressor {
    public void compress(String file) {
        System.out.println("ZIP Compressed: " + file);
    }
}
