package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example11;

public class IOExceptionHandler extends ExceptionHandler {
    @Override
    public void handle(ExceptionRequest request) {
        if ("IOException".equals(request.getExceptionType())) {
            System.out.println("Handled IO Exception.");
        }
        else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
