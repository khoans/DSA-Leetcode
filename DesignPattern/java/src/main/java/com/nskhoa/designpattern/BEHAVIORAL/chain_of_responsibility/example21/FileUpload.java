package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example21;

// Request class
public class FileUpload {
    private int sizeInMB;
    private String fileType;
    private boolean virusFound;

    public FileUpload(int sizeInMB, String fileType, boolean virusFound) {
        this.sizeInMB = sizeInMB;
        this.fileType = fileType;
        this.virusFound = virusFound;
    }

    public int getSizeInMB() { return sizeInMB; }
    public String getFileType() { return fileType; }
    public boolean isVirusFound() { return virusFound; }
}
