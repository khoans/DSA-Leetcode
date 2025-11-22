package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example54;

public class CompressionHandler extends BackupHandler {
    @Override
    public void backup(BackupRequest request) {
        System.out.println("Files compressed.");
        request.setFilesCompressed(true);
        if (nextHandler != null) {
            nextHandler.backup(request);
        }
    }
}
