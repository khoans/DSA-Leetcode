package com.nskhoa.designpattern.CREATIONAL.factory_method.example9;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.Account;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.AccountFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.loan_account.LoanAccountFactory;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.saving_account.SavingAccountFactory;

public class Runner {
    public static void main(String[] args) {
        AccountFactory savingAccountFactory = new SavingAccountFactory();
        Account savingAccount = savingAccountFactory.createAccount();
        savingAccount.getAccountType();

        AccountFactory loanAccountFactory = new LoanAccountFactory();
        Account loanAccount = loanAccountFactory.createAccount();
        loanAccount.getAccountType();


    }
}
