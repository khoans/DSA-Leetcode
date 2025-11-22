package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example55;

public class VirtualAssistantDemo {
    public static void main(String[] args) {
        VirtualAssistantHandler interpreter = new IntentInterpreter();
        VirtualAssistantHandler fetcher = new InformationFetcher();
        VirtualAssistantHandler executor = new ActionExecutor();

        interpreter.setNextHandler(fetcher);
        fetcher.setNextHandler(executor);

        Command cmd = new Command("Turn on the lights in the living room");
        interpreter.handle(cmd);
    }
}
