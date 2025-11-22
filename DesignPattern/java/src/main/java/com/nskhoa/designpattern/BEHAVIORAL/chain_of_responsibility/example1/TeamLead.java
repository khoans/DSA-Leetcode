package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example1;

// Concrete Handlers
public class TeamLead extends LeaveApprover {
    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getNumberOfDays() <= 2) {
            System.out.println("TeamLead approved " + request.getNumberOfDays() +
                               " day(s) leave for " + request.getEmployeeName());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
