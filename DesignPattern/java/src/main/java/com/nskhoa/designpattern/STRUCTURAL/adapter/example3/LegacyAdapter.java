package com.nskhoa.designpattern.STRUCTURAL.adapter.example3;

// Adapter to bridge old and new
public class LegacyAdapter implements NewSystem {
    private LegacySystem legacy = new LegacySystem();
    public String getData() {
        return legacy.fetchLegacyData();
    }
}
