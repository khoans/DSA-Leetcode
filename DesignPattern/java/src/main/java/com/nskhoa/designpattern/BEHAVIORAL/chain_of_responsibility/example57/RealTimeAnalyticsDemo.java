package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example57;

public class RealTimeAnalyticsDemo {
    public static void main(String[] args) {
        DataHandler filter = new DataFilter();
        DataHandler aggregate = new DataAggregator();
        DataHandler visualize = new DataVisualizer();

        filter.setNextHandler(aggregate);
        aggregate.setNextHandler(visualize);

        Data data = new Data("Raw streaming data! #2025");
        filter.handle(data);
    }
}
