package com.monirtanveen;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("880 1730286381");

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available options)");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    shoutDownPhone();
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    createContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void shoutDownPhone() {
        System.out.println("Shutting down phone...");
    }

    private static void printContacts() {
        mobilePhone.printTheListOfContacts();
    }

    private static void createContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter contact number:");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added. Name: " + name + ", phone: " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter contact name to update:");
        String contactName = scanner.nextLine();
        System.out.println("Enter new contact name:");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new contact number:");
        String newContactNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newContactName, newContactNumber);

        if (mobilePhone.updateContact(contactName, newContact)) {
            System.out.println("Contact has updated successfully");
        } else {
            System.out.println("Cannot update, " + contactName + " is not found on file");
        }
    }

    private static void deleteContact() {
        System.out.println("Enter contact name to delete:");
        String contactName = scanner.nextLine();

        if (mobilePhone.removeContact(contactName)) {
            System.out.println(contactName + " has deleted successfully from the contact file");
        } else {
            System.out.println("Cannot delete, " + contactName + " is not found on file");
        }
    }

    private static void searchContact() {
        System.out.println("Enter contact name to search:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact != null) {
            System.out.println("Contact: " + contact.getName() + '(' + contact.getPhoneNumber() + ')');
        } else {
            System.out.println(name + " is not found on file");
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("\n 0 - to shutdown" +
                "\n 1 - to print contacts" +
                "\n 2 - to add a new contact" +
                "\n 3 - to update an existing contact" +
                "\n 4 - to remove an existing contact" +
                "\n 5 - to query if a contact exists" +
                "\n 6 - to print a list of available actions");
        System.out.println("Choose your action:");
    }
}
