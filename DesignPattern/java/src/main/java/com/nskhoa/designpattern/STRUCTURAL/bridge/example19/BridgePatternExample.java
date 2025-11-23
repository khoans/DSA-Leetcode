package com.nskhoa.designpattern.STRUCTURAL.bridge.example19;

public class BridgePatternExample {
    public static void main(String[] args) {
        HealthcareClient desktopHospitalUI = new DesktopHealthcareClient(new HospitalSystem());
        desktopHospitalUI.showRecords();

        HealthcareClient mobileClinicUI = new MobileHealthcareClient(new ClinicSystem());
        mobileClinicUI.showRecords();
    }
}
