package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example54;


public class BackupRecoveryDemo {
    public static void main(String[] args) {
        BackupHandler dataValidator = new DataValidator();
        BackupHandler compressor = new CompressionHandler();
        BackupHandler storage = new StorageHandler();

        dataValidator.setNextHandler(compressor);
        compressor.setNextHandler(storage);

        BackupRequest request = new BackupRequest(true);
        dataValidator.backup(request);
    }
}
