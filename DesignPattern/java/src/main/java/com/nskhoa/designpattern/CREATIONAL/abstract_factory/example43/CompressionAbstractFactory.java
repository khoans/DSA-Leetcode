package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

public interface CompressionAbstractFactory {
    Compressor createCompressor();

    Decompressor createDecompressor();
}
