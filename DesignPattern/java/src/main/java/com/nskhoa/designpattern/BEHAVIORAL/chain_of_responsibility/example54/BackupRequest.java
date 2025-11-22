package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example54;

public class BackupRequest {
    private boolean dataValid;
    boolean filesCompressed;
    private boolean backupStored;

    public BackupRequest(boolean dataValid) {
        this.dataValid = dataValid;
    }

    public boolean isDataValid() {
        return dataValid;
    }

    public void setFilesCompressed(boolean val) {
        filesCompressed = val;
    }

    public void setBackupStored(boolean val) {
        backupStored = val;
    }
}
