package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example43;

public class UnknownDiagnosis extends DiagnosisHandler {
    @Override
    public void diagnose(Patient patient) {
        patient.setDiagnosis("Unknown condition");
        System.out.println("Diagnosis unknown. Further tests required.");
    }
}
