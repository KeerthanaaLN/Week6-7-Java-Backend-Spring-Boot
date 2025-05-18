package org.example;

import java.util.Scanner;

public class BankApp {
    private static int accountCounter = 101;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bank bank = null;

        System.out.println("Select Bank Type:");
        System.out.println("1. Nationalized Bank");
        System.out.println("2. Cooperative Bank");
        int bankChoice = in.nextInt();
        in.nextLine();

        System.out.print("Enter Bank Name: ");
        String bankName = in.nextLine();

        System.out.print("Enter Branch Name: ");
        String branchName = in.nextLine();

        if (bankChoice == 1) {
            bank = new NationalizedBank(bankName, branchName);
        } else if (bankChoice == 2) {
            bank = new CooperativeBank(bankName, branchName);
        } else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        while (true) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Bank and Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select Account Type:");
                    System.out.println("1. Savings");
                    System.out.println("2. Current");
                    System.out.println("3. Loan");
                    int accType = in.nextInt();
                    in.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = in.nextDouble();
                    in.nextLine();

                    String accNum = "ACC" + accountCounter++;
                    Account account = null;

                    switch (accType) {
                        case 1:
                            account = new SavingsAccount(accNum, name, balance);
                            break;
                        case 2:
                            account = new CurrentAccount(accNum, name, balance);
                            break;
                        case 3:
                            account = new LoanAccount(accNum, name, balance);
                            break;
                        default:
                            System.out.println("Invalid account type.");
                    }

                    if (account != null) {
                        bank.openAccount(account);
                        System.out.println("Account Number: " + accNum);
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String depAcc = in.nextLine();
                    Account acc1 = bank.findAccount(depAcc);
                    if (acc1 != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        double amt = in.nextDouble();
                        acc1.deposit(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String wAcc = in.nextLine();
                    Account acc2 = bank.findAccount(wAcc);
                    if (acc2 != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double amt = in.nextDouble();
                        acc2.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    bank.displayBankInfo();
                    bank.displayAccounts();
                    break;

                case 5:
                    System.out.println("Thank you for using the Banking Application.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

