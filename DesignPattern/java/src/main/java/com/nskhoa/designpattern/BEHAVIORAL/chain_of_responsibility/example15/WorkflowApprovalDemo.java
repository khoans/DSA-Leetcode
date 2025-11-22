package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example15;

// Client runner
public class WorkflowApprovalDemo {
    public static void main(String[] args) {
        WorkflowStep supervisor = new Supervisor();
        WorkflowStep manager = new Manager();
        WorkflowStep director = new Director();

        supervisor.setNextStep(manager);
        manager.setNextStep(director);

        WorkflowRequest r1 = new WorkflowRequest(800);
        WorkflowRequest r2 = new WorkflowRequest(3200);
        WorkflowRequest r3 = new WorkflowRequest(10000);

        supervisor.approve(r1);
        supervisor.approve(r2);
        supervisor.approve(r3);
    }
}

