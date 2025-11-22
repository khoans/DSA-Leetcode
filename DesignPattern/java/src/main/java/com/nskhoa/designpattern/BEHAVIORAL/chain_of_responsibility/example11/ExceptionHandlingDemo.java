package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example11;

// Client runner
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        ExceptionHandler fileNotFoundHandler = new FileNotFoundExceptionHandler();
        ExceptionHandler ioHandler = new IOExceptionHandler();
        ExceptionHandler genericHandler = new GenericExceptionHandler();

        fileNotFoundHandler.setNextHandler(ioHandler);
        ioHandler.setNextHandler(genericHandler);

        ExceptionRequest req1 = new ExceptionRequest("FileNotFoundException");
        ExceptionRequest req2 = new ExceptionRequest("IOException");
        ExceptionRequest req3 = new ExceptionRequest("NullPointerException");

        fileNotFoundHandler.handle(req1);
        fileNotFoundHandler.handle(req2);
        fileNotFoundHandler.handle(req3);
    }
}

