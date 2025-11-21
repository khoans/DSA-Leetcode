package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public class ZIPDecompressor implements Decompressor {
    public String decompress(String archive) {
        return "ZIP Decompressed";
    }
}
