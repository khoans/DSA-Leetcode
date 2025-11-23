package com.nskhoa.designpattern.STRUCTURAL.bridge.example19;

public abstract class HealthcareClient {
    protected PatientManagementSystem system;
    protected HealthcareClient(PatientManagementSystem system) { this.system = system; }
    abstract void showRecords();
}
