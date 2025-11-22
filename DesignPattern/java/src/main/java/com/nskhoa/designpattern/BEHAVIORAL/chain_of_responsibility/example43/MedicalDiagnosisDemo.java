package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example43;

public class MedicalDiagnosisDemo {
    public static void main(String[] args) {
        DiagnosisHandler cold = new ColdDiagnosis();
        DiagnosisHandler flu = new FluDiagnosis();
        DiagnosisHandler unknown = new UnknownDiagnosis();

        cold.setNextHandler(flu);
        flu.setNextHandler(unknown);

        Patient patient = new Patient("cough and fever");
        cold.diagnose(patient);
        System.out.println("Diagnosis: " + patient.getDiagnosis());
    }
}
