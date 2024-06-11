package com.digitalbank;

import com.digitalbank.model.CurrentAccount;
import com.digitalbank.model.SavingsAccount;
import com.digitalbank.repository.Account;

public class App {
    public static void main(String[] args) {
        Account current = new CurrentAccount();
        Account savings = new SavingsAccount();

        current.printBankStatement();
        current.depositMoney(100);
        current.printBankStatement();
        current.transferMoney(100, savings);


        savings.printBankStatement();


    }
}