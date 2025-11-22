package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example57;

public class DataVisualizer extends DataHandler {
    @Override
    public void handle(Data data) {
        data.setVisualization("Visualizing: " + data.aggregatedData);
        System.out.println(data.visualization);
    }
}
