package com.nskhoa.designpattern.creational.factory_method.example9.factory.loan_account;

import com.nskhoa.designpattern.creational.factory_method.example9.factory.Account;

public class LoanAccount implements Account {
    @Override
    public String getAccountType() {
        return "Loan";
    }
}
