package com.digitalbank.repository;

public interface AccountInterface {
    void withdrawMoney(double value);

    void depositMoney(double value);

    void transferMoney(double value, AccountInterface shippingAccount);
    void printBankStatement();
}
