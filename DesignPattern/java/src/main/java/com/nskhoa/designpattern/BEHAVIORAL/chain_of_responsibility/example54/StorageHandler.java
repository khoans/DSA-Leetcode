package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example54;

public class StorageHandler extends BackupHandler {
    @Override
    public void backup(BackupRequest request) {
        if (request.filesCompressed) {
            System.out.println("Backup stored successfully.");
            request.setBackupStored(true);
        }
        else {
            System.out.println("Backup failed. Files not compressed.");
        }
    }
}
