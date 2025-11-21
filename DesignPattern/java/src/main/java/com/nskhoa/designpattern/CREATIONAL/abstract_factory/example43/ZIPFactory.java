package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public class ZIPFactory implements CompressionAbstractFactory {
    public Compressor createCompressor() {
        return new ZIPCompressor();
    }

    public Decompressor createDecompressor() {
        return new ZIPDecompressor();
    }
}
