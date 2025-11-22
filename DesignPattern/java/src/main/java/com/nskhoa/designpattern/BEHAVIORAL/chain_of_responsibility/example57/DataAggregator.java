package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example57;

public class DataAggregator extends DataHandler {
    @Override
    public void handle(Data data) {
        data.setAggregatedData(data.filteredData.toUpperCase());
        System.out.println("Data aggregated: " + data.aggregatedData);
        if (nextHandler != null) {
            nextHandler.handle(data);
        }
    }
}
