package com.monirtanveen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account accountMonir = new Account(
                "AEC1101",
                100d,
                "Monir Ahmed",
                "monir@newroztech.com",
                "+9641677611008"
        );

        Account accountDefault = new Account();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("---------------Customer Information------------------");
            System.out.println("Name: " + accountMonir.getCustomerName());
            System.out.println("Email: " + accountMonir.getEmail());
            System.out.println("Contact No: " + accountMonir.getPhoneNumber());
            System.out.println("Account No: " + accountMonir.getAccountNumber());
            System.out.println("Balance: " + accountMonir.getBalance());

            System.out.println("Choices:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 3) {
                    System.out.println("Thanks For Using FastPay.");
                    break;
                }

                switch (choice) {
                    case 1 :
                        System.out.println("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        accountMonir.deposit(depositAmount);
                        break;
                    case 2 :
                        System.out.println("Enter Withdraw Amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        accountMonir.withdraw(withdrawAmount);
                        break;
                    default:
                        System.out.println("Invalid Entry.");
                        break;
                }
            } else {
                System.out.println("Invalid Choice");
                scanner.nextLine();
            }
        } while (true);

        scanner.close();
    }
}
