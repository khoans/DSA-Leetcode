package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example11;

// Concrete Handlers
public class FileNotFoundExceptionHandler extends ExceptionHandler {
    @Override
    public void handle(ExceptionRequest request) {
        if ("FileNotFoundException".equals(request.getExceptionType())) {
            System.out.println("Handled File Not Found Exception.");
        }
        else if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
