package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example43;

public abstract class DiagnosisHandler {
    protected DiagnosisHandler nextHandler;

    public void setNextHandler(DiagnosisHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void diagnose(Patient patient);
}
