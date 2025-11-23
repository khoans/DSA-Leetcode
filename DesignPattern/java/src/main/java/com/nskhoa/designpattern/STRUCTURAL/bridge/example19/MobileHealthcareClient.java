package com.nskhoa.designpattern.STRUCTURAL.bridge.example19;

public class MobileHealthcareClient extends HealthcareClient {
    public MobileHealthcareClient(PatientManagementSystem system) { super(system); }
    public void showRecords() {
        System.out.print("Mobile UI: ");
        system.displayPatientRecords();
    }
}
