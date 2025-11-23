package com.nskhoa.designpattern.STRUCTURAL.adapter.example29;

public class AzureBlobAdapter implements CloudStorage {
    private AzureBlobStorage azure = new AzureBlobStorage();

    public void uploadFile(String filename) {
        azure.uploadToAzure(filename);
    }
}
