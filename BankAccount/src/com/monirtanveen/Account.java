package com.monirtanveen;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        // Empty Constructor
        this("DEF_AEC1102",
                100d,
                "Monir Ahmed",
                "monir@newroztech.com",
                "+9641677611008");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println(depositAmount + " has deposited successfully. Current balance: " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance < withdrawAmount) {
            System.out.println("Insufficient Fund");
            return;
        }

        this.balance -= withdrawAmount;
        System.out.println(withdrawAmount + " has withdrawn successfully. Current balance: " + this.balance);
    }
}
