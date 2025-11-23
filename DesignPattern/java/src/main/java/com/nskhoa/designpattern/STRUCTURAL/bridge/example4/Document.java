package com.nskhoa.designpattern.STRUCTURAL.bridge.example4;

public abstract class Document {
    protected DocumentFormatter formatter;

    Document(DocumentFormatter formatter) {
        this.formatter = formatter;
    }

    abstract void generate();
}
