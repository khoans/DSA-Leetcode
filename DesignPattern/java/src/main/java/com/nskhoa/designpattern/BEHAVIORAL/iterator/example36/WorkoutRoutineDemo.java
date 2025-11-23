package com.nskhoa.designpattern.BEHAVIORAL.iterator.example36;

public class WorkoutRoutineDemo {
    public static void main(String[] args) {
        WorkoutRoutine routine = new WorkoutRoutine();
        routine.addWorkout(new Workout("Push-ups"));
        routine.addWorkout(new Workout("Squats"));

        MyIterator<Workout> it = routine.createIterator();
        while (it.hasNext()) {
            System.out.println(it
                                       .next()
                                       .getExercise());
        }
    }
}
