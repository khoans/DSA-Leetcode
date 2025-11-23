package com.nskhoa.designpattern.STRUCTURAL.adapter.example35;

public class FlagsmithAdapter implements FeatureFlagManager {
    private Flagsmith flagsmith = new Flagsmith();
    public boolean isFeatureEnabled(String feature) {
        return flagsmith.flagsmithIsEnabled(feature);
    }
}
