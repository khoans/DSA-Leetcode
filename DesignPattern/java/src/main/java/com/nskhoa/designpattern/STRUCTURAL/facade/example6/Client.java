package com.nskhoa.designpattern.STRUCTURAL.facade.example6;

class AccountManager {
    void manageAccounts() { System.out.println("Managing accounts"); }
}

class TransactionProcessor {
    void processTransactions() { System.out.println("Processing transactions"); }
}

class ReportGenerator {
    void generateReports() { System.out.println("Generating reports"); }
}

class BankingFacade {
    private AccountManager accountManager = new AccountManager();
    private TransactionProcessor transactionProcessor = new TransactionProcessor();
    private ReportGenerator reportGenerator = new ReportGenerator();

    void performBankingOperations() {
        accountManager.manageAccounts();
        transactionProcessor.processTransactions();
        reportGenerator.generateReports();
    }
}

public class Client {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.performBankingOperations();
    }
}
