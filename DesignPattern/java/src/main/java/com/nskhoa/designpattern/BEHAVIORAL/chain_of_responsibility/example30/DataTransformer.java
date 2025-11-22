package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example30;

// Abstract Handler
public abstract class DataTransformer {
    protected DataTransformer nextTransformer;

    public void setNextTransformer(DataTransformer nextTransformer) {
        this.nextTransformer = nextTransformer;
    }

    public abstract void transform(Data data);
}
