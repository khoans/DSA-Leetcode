package com.nskhoa.designpattern.creational.factory_method.example9.factory.saving_account;

import com.nskhoa.designpattern.creational.factory_method.example9.factory.Account;

public class SavingAccount implements Account {
    @Override
    public String getAccountType() {
        return "Saving Account";
    }
}
