package com.nskhoa.designpattern.STRUCTURAL.adapter.example29;

public class Client {
    public static void main(String[] args) {
        CloudStorage awsAdapter = new AwsS3Adapter();
        awsAdapter.uploadFile("file1.txt");

        CloudStorage googleAdapter = new GoogleStorageAdapter();
        googleAdapter.uploadFile("file2.txt");

        CloudStorage azureAdapter = new AzureBlobAdapter();
        azureAdapter.uploadFile("file3.txt");
    }
}
