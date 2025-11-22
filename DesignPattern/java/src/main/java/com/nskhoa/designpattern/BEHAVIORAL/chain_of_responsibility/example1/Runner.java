package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example1;

// Client usage
public class Runner {
    public static void main(String[] args) {
        // Set up chain
        LeaveApprover teamLead = new TeamLead();
        LeaveApprover manager = new Manager();
        LeaveApprover director = new Director();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        // Test requests
        LeaveRequest r1 = new LeaveRequest("Alice", 1);
        LeaveRequest r2 = new LeaveRequest("Bob", 4);
        LeaveRequest r3 = new LeaveRequest("Charlie", 8);
        LeaveRequest r4 = new LeaveRequest("Dave", 12);

        teamLead.processRequest(r1);
        teamLead.processRequest(r2);
        teamLead.processRequest(r3);
        teamLead.processRequest(r4);
    }
}
