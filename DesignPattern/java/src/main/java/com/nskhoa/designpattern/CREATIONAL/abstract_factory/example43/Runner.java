package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example43;

// Usage: CompressionAbstractFactory factory = new GZIPFactory(); Compressor comp = factory.createCompressor(); comp.compress("data.txt");
public class Runner {
    public static void main(String[] args) {
        CompressionAbstractFactory factory = new GZIPFactory();
        Compressor compressor = factory.createCompressor();
        Decompressor decompressor = factory.createDecompressor();

        compressor.compress("file.txt");
        System.out.println(decompressor.decompress("file.gz"));
    }
}
