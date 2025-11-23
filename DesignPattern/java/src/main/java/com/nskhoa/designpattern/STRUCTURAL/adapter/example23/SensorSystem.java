package com.nskhoa.designpattern.STRUCTURAL.adapter.example23;

public class SensorSystem {
    private final SensorData[] data = new SensorData[10];
    private int count = 0;

    void addData(SensorData entry) {
        if (count < data.length) {
            data[count++] = entry;
        }
    }

    MyIterator<SensorData> createIterator() {
        return new SensorDataIterator();
    }

    private class SensorDataIterator implements MyIterator<SensorData> {
        int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public SensorData next() {
            return data[index++];
        }
    }
}
