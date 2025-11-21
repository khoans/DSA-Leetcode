package com.nskhoa.designpattern.CREATIONAL.abstract_factory.example39;

public interface AudioAbstractFactory {
    Encoder createEncoder();

    Decoder createDecoder();
}
