package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example12;

// Client runner
public class MiddlewareChainDemo {
    public static void main(String[] args) {
        Middleware logging = new LoggingMiddleware();
        Middleware auth = new AuthenticationMiddleware();
        Middleware compression = new CompressionMiddleware();

        logging.setNext(auth);
        auth.setNext(compression);

        Request request = new Request("/api/data");
        logging.handle(request);
    }
}

