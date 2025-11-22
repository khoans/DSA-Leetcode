package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example57;

public class Data {
    private String rawData;
    String filteredData;
    String aggregatedData;
    String visualization;

    public Data(String rawData) {
        this.rawData = rawData;
    }

    public String getRawData() {
        return rawData;
    }

    public void setFilteredData(String val) {
        filteredData = val;
    }

    public void setAggregatedData(String val) {
        aggregatedData = val;
    }

    public void setVisualization(String val) {
        visualization = val;
    }
}
