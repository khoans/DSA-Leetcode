package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example57;

public class DataFilter extends DataHandler {
    @Override
    public void handle(Data data) {
        data.setFilteredData(data
                                     .getRawData()
                                     .replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println("Data filtered: " + data.filteredData);
        if (nextHandler != null) {
            nextHandler.handle(data);
        }
    }
}
