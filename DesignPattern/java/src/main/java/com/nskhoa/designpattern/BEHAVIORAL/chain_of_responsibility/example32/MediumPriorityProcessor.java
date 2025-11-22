package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example32;

public class MediumPriorityProcessor extends TaskProcessor {
    @Override
    public void process(Task task) {
        if (task.getPriority() <= 7) {
            task.escalate();
            System.out.println("Medium priority task escalated.");
        }
        else if (nextProcessor != null) {
            nextProcessor.process(task);
        }
    }
}
