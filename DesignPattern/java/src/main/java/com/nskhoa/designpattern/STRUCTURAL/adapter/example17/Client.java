package com.nskhoa.designpattern.STRUCTURAL.adapter.example17;

public class Client {
    private MLModel model;

    public Client(MLModel model) {
        this.model = model;
    }

    public void makePrediction(String input) {
        model.predict(input);
    }

    public static void main(String[] args) {
        MLModel tfAdapter = new TensorFlowAdapter();
        Client client1 = new Client(tfAdapter);
        client1.makePrediction("data1");

        MLModel ptAdapter = new PyTorchAdapter();
        Client client2 = new Client(ptAdapter);
        client2.makePrediction("data2");
    }
}
