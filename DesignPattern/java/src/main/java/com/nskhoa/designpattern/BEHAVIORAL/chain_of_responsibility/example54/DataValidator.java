package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example54;

public class DataValidator extends BackupHandler {
    @Override
    public void backup(BackupRequest request) {
        if (request.isDataValid()) {
            System.out.println("Data validated.");
            if (nextHandler != null) {
                nextHandler.backup(request);
            }
        }
        else {
            System.out.println("Data invalid, backup aborted.");
        }
    }
}
