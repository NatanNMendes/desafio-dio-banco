package com.digitalbank.model;

import com.digitalbank.repository.Account;

public class CurrentAccount extends Account {
    @Override
    public void printBankStatement() {
        System.out.println("Extrato Conta Corrente");
        super.printBankInfo();
    }

}
