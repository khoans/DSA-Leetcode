package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example21;

public class VirusScanValidator extends FileValidator {
    @Override
    public void validate(FileUpload file) {
        if (!file.isVirusFound()) {
            System.out.println("Virus scan passed.");
            System.out.println("File upload allowed.");
        } else {
            System.out.println("Virus detected! Upload denied.");
        }
    }
}
