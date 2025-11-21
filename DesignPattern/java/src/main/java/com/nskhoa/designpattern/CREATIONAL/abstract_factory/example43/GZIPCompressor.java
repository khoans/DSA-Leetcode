package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public class GZIPCompressor implements Compressor {
    public void compress(String file) {
        System.out.println("GZIP Compressed: " + file);
    }
}
