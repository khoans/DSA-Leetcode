package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public class GZIPFactory implements CompressionAbstractFactory {
    public Compressor createCompressor() {
        return new GZIPCompressor();
    }

    public Decompressor createDecompressor() {
        return new GZIPDecompressor();
    }
}
