package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example11;

// Request class
public class ExceptionRequest {
    private String exceptionType;

    public ExceptionRequest(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getExceptionType() {
        return exceptionType;
    }
}
