package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example1;

// Request class
public class LeaveRequest {
    private String employeeName;
    private int numberOfDays;

    public LeaveRequest(String employeeName, int numberOfDays) {
        this.employeeName = employeeName;
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
