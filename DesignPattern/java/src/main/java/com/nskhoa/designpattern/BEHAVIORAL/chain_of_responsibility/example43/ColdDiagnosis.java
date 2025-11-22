package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example43;

public class ColdDiagnosis extends DiagnosisHandler {
    @Override
    public void diagnose(Patient patient) {
        if (patient
                .getSymptoms()
                .contains("cough")) {
            patient.setDiagnosis("Common Cold");
            System.out.println("Diagnosed with Common Cold.");
        }
        else if (nextHandler != null) {
            nextHandler.diagnose(patient);
        }
    }
}
