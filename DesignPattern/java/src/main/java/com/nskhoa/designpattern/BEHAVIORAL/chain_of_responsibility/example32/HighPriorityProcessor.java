package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example32;

public class HighPriorityProcessor extends TaskProcessor {
    @Override
    public void process(Task task) {
        task.reject();
        System.out.println("High priority task rejected.");
    }
}
