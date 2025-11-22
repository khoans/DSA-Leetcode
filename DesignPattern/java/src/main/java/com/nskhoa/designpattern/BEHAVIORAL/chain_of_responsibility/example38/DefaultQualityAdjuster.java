package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example38;

public class DefaultQualityAdjuster extends QualityAdjuster {
    @Override
    public void adjust(StreamRequest request) {
        request.setQuality("High");
        System.out.println("Default: setting quality to High");
    }
}
