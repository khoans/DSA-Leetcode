package com.nskhoa.designpattern.creational.factory_method.example9.factory.loan_account;

import com.nskhoa.designpattern.creational.factory_method.example9.factory.Account;
import com.nskhoa.designpattern.creational.factory_method.example9.factory.AccountFactory;

public class LoanAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {

        return new LoanAccount();
    }
}
