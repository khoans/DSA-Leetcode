package com.nskhoa.designpattern.BEHAVIORAL.chain_of_responsibility.example28;

// Client runner
public class ResourceCleanupDemo {
    public static void main(String[] args) {
        CleanupHandler streamClose = new StreamCloseHandler();
        CleanupHandler transactionCommit = new TransactionCommitHandler();
        CleanupHandler lockRelease = new LockReleaseHandler();

        streamClose.setNextHandler(transactionCommit);
        transactionCommit.setNextHandler(lockRelease);

        streamClose.cleanup();
    }
}

