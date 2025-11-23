package com.nskhoa.designpattern.STRUCTURAL.adapter.example17;

public class TensorFlowAdapter implements MLModel {
    private TensorFlowModel tfModel = new TensorFlowModel();
    public void predict(String input) {
        tfModel.tensorflowPredict(input);
    }
}
