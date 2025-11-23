package com.nskhoa.designpattern.STRUCTURAL.adapter.example35;

public class UnleashAdapter implements FeatureFlagManager {
    private Unleash unleash = new Unleash();
    public boolean isFeatureEnabled(String feature) {
        return unleash.unleashIsEnabled(feature);
    }
}
