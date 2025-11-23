package com.nskhoa.designpattern.STRUCTURAL.adapter.example35;

public class LaunchDarklyAdapter implements FeatureFlagManager {
    private LaunchDarkly ld = new LaunchDarkly();
    public boolean isFeatureEnabled(String feature) {
        return ld.ldIsEnabled(feature);
    }
}
