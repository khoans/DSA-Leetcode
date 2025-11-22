package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example32;

// Concrete Handlers
public class LowPriorityProcessor extends TaskProcessor {
    @Override
    public void process(Task task) {
        if (task.getPriority() <= 3) {
            task.approve();
            System.out.println("Low priority task approved.");
        }
        else if (nextProcessor != null) {
            nextProcessor.process(task);
        }
    }
}
