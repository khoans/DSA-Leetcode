package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example11;

public class GenericExceptionHandler extends ExceptionHandler {
    @Override
    public void handle(ExceptionRequest request) {
        System.out.println("Handled generic exception type: " + request.getExceptionType());
    }
}
