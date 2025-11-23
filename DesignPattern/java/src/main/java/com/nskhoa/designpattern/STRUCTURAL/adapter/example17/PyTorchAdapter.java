package com.nskhoa.designpattern.STRUCTURAL.adapter.example17;

public class PyTorchAdapter implements MLModel {
    private PyTorchModel ptModel = new PyTorchModel();
    public void predict(String input) {
        ptModel.pytorchPredict(input);
    }
}
