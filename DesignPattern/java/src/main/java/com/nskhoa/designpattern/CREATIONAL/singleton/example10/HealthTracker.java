package com.nskhoa.designpattern.CREATIONAL.singleton.example10;

import java.util.ArrayList;
import java.util.List;

public class HealthTracker {
    private static HealthTracker instance;
    private List<Double> weights = new ArrayList<>();

    private HealthTracker() {
    }

    public static HealthTracker getInstance() {
        if (instance == null) {
            instance = new HealthTracker();
        }
        return instance;
    }

    public void addWeight(double weight) {
        weights.add(weight);
    }

    public List<Double> getWeights() {
        return weights;
    }

    public static void main(String[] args) {
        HealthTracker tracker = HealthTracker.getInstance();
        tracker.addWeight(70.5);
        tracker.addWeight(69.8);
        tracker.addWeight(68.9);

        System.out.println("Recorded Weights: " + tracker.getWeights());
    }
}
