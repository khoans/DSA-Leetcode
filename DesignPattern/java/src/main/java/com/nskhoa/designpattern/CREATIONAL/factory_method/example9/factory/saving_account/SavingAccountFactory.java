package com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.saving_account;

import com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.Account;
import com.nskhoa.designpattern.CREATIONAL.factory_method.example9.factory.AccountFactory;

public class SavingAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {

        return new SavingAccount();
    }
}
