package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example32;

// Client runner
public class WorkflowTaskProcessingDemo {
    public static void main(String[] args) {
        TaskProcessor low = new LowPriorityProcessor();
        TaskProcessor medium = new MediumPriorityProcessor();
        TaskProcessor high = new HighPriorityProcessor();

        low.setNextProcessor(medium);
        medium.setNextProcessor(high);

        Task t1 = new Task(2);
        Task t2 = new Task(5);
        Task t3 = new Task(9);

        low.process(t1);
        System.out.println("Task 1 status: " + t1.getStatus());

        low.process(t2);
        System.out.println("Task 2 status: " + t2.getStatus());

        low.process(t3);
        System.out.println("Task 3 status: " + t3.getStatus());
    }
}
