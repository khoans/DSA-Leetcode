package com.nskhoa.designpattern.STRUCTURAL.facade.example20;

class CashDispenser {
    void dispenseCash() { System.out.println("Dispensing cash"); }
}
class AccountValidator {
    void validateAccount() { System.out.println("Validating account"); }
}
class TransactionProcessor {
    void processTransaction() { System.out.println("Processing transaction"); }
}

class ATMFacade {
    private CashDispenser dispenser = new CashDispenser();
    private AccountValidator validator = new AccountValidator();
    private TransactionProcessor processor = new TransactionProcessor();

    void performWithdrawal() {
        validator.validateAccount();
        processor.processTransaction();
        dispenser.dispenseCash();
    }
}

public class ATMClient {
    public static void main(String[] args) {
        ATMFacade atm = new ATMFacade();
        atm.performWithdrawal();
    }
}
