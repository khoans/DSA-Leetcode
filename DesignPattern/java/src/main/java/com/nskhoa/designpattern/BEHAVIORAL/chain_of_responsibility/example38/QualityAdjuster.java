package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example38;

// Abstract Handler
public abstract class QualityAdjuster {
    protected QualityAdjuster nextAdjuster;

    public void setNextAdjuster(QualityAdjuster nextAdjuster) {
        this.nextAdjuster = nextAdjuster;
    }

    public abstract void adjust(StreamRequest request);
}
