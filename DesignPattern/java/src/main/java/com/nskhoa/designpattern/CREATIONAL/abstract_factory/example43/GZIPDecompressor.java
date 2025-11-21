package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public class GZIPDecompressor implements Decompressor {
    public String decompress(String archive) {
        return "GZIP Decompressed";
    }
}
