package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example34;

// Client runner
public class IoTCommandHandlingDemo {
    public static void main(String[] args) {
        IoTCommandHandler validation = new ValidationHandler();
        IoTCommandHandler logging = new LoggingHandler();
        IoTCommandHandler execution = new ExecutionHandler();

        validation.setNextHandler(logging);
        logging.setNextHandler(execution);

        IoTCommand cmd1 = new IoTCommand("TurnOn", true);
        IoTCommand cmd2 = new IoTCommand("Restart", false);

        validation.handle(cmd1);
        System.out.println("---");
        validation.handle(cmd2);
    }
}
