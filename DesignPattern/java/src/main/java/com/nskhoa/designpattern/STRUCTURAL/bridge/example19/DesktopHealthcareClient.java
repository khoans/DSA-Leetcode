package com.nskhoa.designpattern.STRUCTURAL.bridge.example19;

public class DesktopHealthcareClient extends HealthcareClient {
    public DesktopHealthcareClient(PatientManagementSystem system) { super(system); }
    public void showRecords() {
        System.out.print("Desktop UI: ");
        system.displayPatientRecords();
    }
}
