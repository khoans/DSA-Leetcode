package com.nskhoa.designpattern.creational.prototype.example5;

import java.util.ArrayList;
import java.util.List;

public class TravelPlan implements Cloneable {
    private String destination;
    private List<String> activities = new ArrayList<>();

    public TravelPlan(String destination) {
        this.destination = destination;
    }

    public void addActivity(String act) {
        activities.add(act);
    }

    public TravelPlan clone() {
        try {
            TravelPlan cloned = (TravelPlan) super.clone(); cloned.activities = new ArrayList<>(activities);
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        TravelPlan parisTrip = new TravelPlan("Paris");
        parisTrip.addActivity("Eiffel Tower visit");
        parisTrip.addActivity("Louvre Museum tour");
        parisTrip.addActivity("Seine River cruise");

        TravelPlan clonedPlan = parisTrip.clone();
        clonedPlan.addActivity("Versailles Palace visit");

        System.out.println("Original Travel Plan Activities: " + parisTrip.activities);
        System.out.println("Cloned Travel Plan Activities: " + clonedPlan.activities);
    }
}
