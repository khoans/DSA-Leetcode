package com.nskhoa.designpattern.BEHAVIORAL.iterator.example23;

public class SensorDataDemo {
    public static void main(String[] args) {
        SensorSystem system = new SensorSystem();
        system.addData(new SensorData("temp1", 23.5));
        system.addData(new SensorData("humid1", 45.0));

        MyIterator<SensorData> it = system.createIterator();
        while (it.hasNext()) {
            SensorData d = it.next();
            System.out.println(d.getSensorId() + ": " + d.getValue());
        }
    }
}

