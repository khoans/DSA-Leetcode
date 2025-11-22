package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example43;

public class FluDiagnosis extends DiagnosisHandler {
    @Override
    public void diagnose(Patient patient) {
        if (patient
                .getSymptoms()
                .contains("fever")) {
            patient.setDiagnosis("Flu");
            System.out.println("Diagnosed with Flu.");
        }
        else if (nextHandler != null) {
            nextHandler.diagnose(patient);
        }
    }
}
