package com.nskhoa.designpattern.STRUCTURAL.adapter.example35;

public class Client {
    private FeatureFlagManager ffManager;

    public Client(FeatureFlagManager ffManager) {
        this.ffManager = ffManager;
    }

    public void checkFeature(String feature) {
        if (ffManager.isFeatureEnabled(feature)) {
            System.out.println("Feature " + feature + " is enabled.");
        } else {
            System.out.println("Feature " + feature + " is disabled.");
        }
    }

    public static void main(String[] args) {
        FeatureFlagManager ldAdapter = new LaunchDarklyAdapter();
        FeatureFlagManager unleashAdapter = new UnleashAdapter();
        FeatureFlagManager flagsmithAdapter = new FlagsmithAdapter();

        Client ldClient = new Client(ldAdapter);
        Client unleashClient = new Client(unleashAdapter);
        Client flagsmithClient = new Client(flagsmithAdapter);

        ldClient.checkFeature("NewDashboard");
        unleashClient.checkFeature("BetaFeature");
        flagsmithClient.checkFeature("DarkMode");
    }
}
