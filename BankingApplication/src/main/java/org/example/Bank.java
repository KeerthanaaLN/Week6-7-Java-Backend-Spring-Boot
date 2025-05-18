package org.example;

import java.util.*;

public abstract class Bank {
    protected String bankName;
    protected String branchName;
    protected List<Account> accounts;
    protected static int bankCounter = 1;
    protected static final String BANK_CODE_PREFIX = "BANK-";
    protected String bankCode;

    public Bank(String bankName, String branchName) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.bankCode = generateBankCode();
        this.accounts = new ArrayList<>();
    }

    public String generateBankCode() {
        return BANK_CODE_PREFIX + String.format("%03d", bankCounter++);
    }

    public abstract void openAccount(Account account);
    public abstract void displayBankInfo();

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void displayAccounts() {
        for (Account acc : accounts) {
            acc.showAccountType();
            System.out.println("Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println();
        }
    }
}


