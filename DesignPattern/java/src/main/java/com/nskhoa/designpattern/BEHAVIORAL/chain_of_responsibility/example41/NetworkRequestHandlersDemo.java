package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example41;

public class NetworkRequestHandlersDemo {
    public static void main(String[] args) {
        NetworkRequestHandler auth = new AuthenticationHandler();
        NetworkRequestHandler logging = new LoggingHandler();
        NetworkRequestHandler routing = new RoutingHandler();

        auth.setNextHandler(logging);
        logging.setNextHandler(routing);

        NetworkRequest request = new NetworkRequest("valid-token", "/api/users");
        auth.handle(request);
    }
}

