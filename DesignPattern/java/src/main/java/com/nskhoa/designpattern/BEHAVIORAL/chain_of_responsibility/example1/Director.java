package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example1;

public class Director extends LeaveApprover {
    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getNumberOfDays() <= 10) {
            System.out.println("Director approved " + request.getNumberOfDays() +
                               " day(s) leave for " + request.getEmployeeName());
        }
        else {
            System.out.println("Leave request for " + request.getNumberOfDays() +
                               " day(s) needs to be handled by higher authorities");
        }
    }
}
