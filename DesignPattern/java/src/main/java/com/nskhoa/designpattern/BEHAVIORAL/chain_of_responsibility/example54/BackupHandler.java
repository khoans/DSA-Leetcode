package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example54;

public abstract class BackupHandler {
    protected BackupHandler nextHandler;

    public void setNextHandler(BackupHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void backup(BackupRequest request);
}
