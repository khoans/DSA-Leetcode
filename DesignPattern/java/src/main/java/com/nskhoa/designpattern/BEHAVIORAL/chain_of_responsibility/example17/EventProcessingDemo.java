package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example17;

// Client runner
public class EventProcessingDemo {
    public static void main(String[] args) {
        EventListener logging = new LoggingListener();
        EventListener metrics = new MetricsListener();
        EventListener notification = new NotificationListener();

        logging.setNextListener(metrics);
        metrics.setNextListener(notification);

        Event event = new Event("UserSignup");
        logging.onEvent(event);
    }
}

