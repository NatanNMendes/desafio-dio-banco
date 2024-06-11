package com.digitalbank.model;

import com.digitalbank.repository.Account;

public class SavingsAccount extends Account {

    public void printBankStatement() {
        System.out.println("Extrato Conta Poupança");
        super.printBankInfo();
    }
}
