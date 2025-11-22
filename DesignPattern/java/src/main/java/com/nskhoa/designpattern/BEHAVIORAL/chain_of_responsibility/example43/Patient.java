package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example43;

public class Patient {
    private String symptoms;
    private String diagnosis;

    public Patient(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
