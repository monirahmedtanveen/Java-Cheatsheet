package com.monirtanveen;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public void printTheListOfContacts() {
        System.out.println("You have total of " + myContacts.size() + " contacts in your contact file.");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + '(' + myContacts.get(i).getPhoneNumber() + ')');
        }
    }

    public boolean updateContact(String contactName, Contact newContact) {
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("Failed! " + newContact.getName() + " is already exists");
            return false;
        }

        int position = findContact(contactName);
        if (position < 0) {
            System.out.println("Failed! " + contactName + " is not found on the file");
            return false;
        }

        myContacts.set(position, newContact);
        return true;
    }

    public boolean removeContact(String contactName) {
        int position = findContact(contactName);
        if (position < 0) {
            return false;
        }

        this.myContacts.remove(position);
        return true;
    }

    public boolean searchForContact(String contactName) {
        return findContact(contactName) >= 0;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private Contact getContact(int position) {
        return this.myContacts.get(position);
    }

    public Contact queryContact(String contactName) {
        int position = findContact(contactName);
        if (position >= 0) {
            return getContact(position);
        }

        return null;
    }
}
