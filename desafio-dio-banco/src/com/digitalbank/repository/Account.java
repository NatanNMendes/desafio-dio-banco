package com.digitalbank.repository;

public abstract class Account implements AccountInterface{

    private static final int AGENCY_DEFAULT = 0;
    private static int SEQUENTIAL = 1;

    protected int bankAgency;
    protected int accountNumber;
    protected double balance;

    public Account() {
        this.bankAgency = Account.AGENCY_DEFAULT;
        this.accountNumber = SEQUENTIAL++;
    }

    public int getBankAgency() {
        return bankAgency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdrawMoney(double value) {
        balance -= value;
    }

    @Override
    public void depositMoney(double value) {
        balance += value;
    }

    @Override
    public void transferMoney(double value, AccountInterface shippingAccount) {
        this.withdrawMoney(value);
        shippingAccount.depositMoney(value);
    }

    protected void printBankInfo(){
        System.out.println(String.format("Agencia: %d", this.bankAgency));
        System.out.println(String.format("Número: %d", this.accountNumber));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
