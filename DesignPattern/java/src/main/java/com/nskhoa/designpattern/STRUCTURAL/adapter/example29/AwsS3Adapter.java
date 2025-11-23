package com.nskhoa.designpattern.STRUCTURAL.adapter.example29;

public class AwsS3Adapter implements CloudStorage {
    private AwsS3Storage aws = new AwsS3Storage();

    public void uploadFile(String filename) {
        aws.uploadToS3(filename);
    }
}
