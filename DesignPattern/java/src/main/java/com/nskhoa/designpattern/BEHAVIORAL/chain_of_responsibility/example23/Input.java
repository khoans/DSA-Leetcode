package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example23;

// Request class
public class Input {
    private String data;

    public Input(String data) {
        this.data = data;
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
}
