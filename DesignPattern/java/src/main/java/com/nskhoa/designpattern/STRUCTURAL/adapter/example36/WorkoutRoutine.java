package com.nskhoa.designpattern.STRUCTURAL.adapter.example36;

public class WorkoutRoutine {
    private final Workout[] workouts = new Workout[10];
    private int count = 0;

    void addWorkout(Workout w) {
        if (count < workouts.length) {
            workouts[count++] = w;
        }
    }

    MyIterator<Workout> createIterator() {
        return new WorkoutIterator();
    }

    private class WorkoutIterator implements MyIterator<Workout> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Workout next() {
            return workouts[index++];
        }
    }
}
