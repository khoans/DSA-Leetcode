package com.nskhoa.designpattern.CREATIONAL.prototype.example2;

import java.util.ArrayList;
import java.util.List;

public class GymSchedule implements Cloneable {
    private String day;
    private List<String> exercises = new ArrayList<>();

    public GymSchedule(String day) {
        this.day = day;
    }

    public void addExercise(String ex) {
        exercises.add(ex);
    }

    public GymSchedule clone() {
        try {
            GymSchedule cloned = (GymSchedule) super.clone(); cloned.exercises = new ArrayList<>(exercises);
            return cloned;
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        GymSchedule mondaySchedule = new GymSchedule("Monday");
        mondaySchedule.addExercise("Push-ups");
        mondaySchedule.addExercise("Squats");
        mondaySchedule.addExercise("Plank");

        GymSchedule clonedSchedule = mondaySchedule.clone();
        clonedSchedule.addExercise("Burpees");

        System.out.println("Monday Schedule: " + mondaySchedule.exercises);
        System.out.println("Cloned Schedule: " + clonedSchedule.exercises);
    }
}
