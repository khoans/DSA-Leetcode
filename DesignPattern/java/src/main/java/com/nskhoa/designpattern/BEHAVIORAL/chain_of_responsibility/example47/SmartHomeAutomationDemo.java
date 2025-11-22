package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example47;

public class SmartHomeAutomationDemo {
    public static void main(String[] args) {
        AutomationHandler lighting = new LightingHandler();
        AutomationHandler temperature = new TemperatureHandler();
        AutomationHandler security = new SecurityHandler();

        lighting.setNextHandler(temperature);
        temperature.setNextHandler(security);

        Command cmd1 = new Command("lighting", "turn on");
        Command cmd2 = new Command("temperature", "set to 22C");
        Command cmd3 = new Command("security", "arm system");
        Command cmd4 = new Command("music", "play jazz");

        lighting.handle(cmd1);
        lighting.handle(cmd2);
        lighting.handle(cmd3);
        lighting.handle(cmd4);
    }
}
