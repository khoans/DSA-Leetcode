package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example1;

public class Manager extends LeaveApprover {
    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getNumberOfDays() <= 5) {
            System.out.println("Manager approved " + request.getNumberOfDays() +
                               " day(s) leave for " + request.getEmployeeName());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
