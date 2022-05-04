package com.monirtanveen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strNames = new ArrayList<>();
        strNames.add("Monir Ahmed");
        strNames.add("Kumu");

        for (String strName : strNames) {
            System.out.println("Name: " + strName);
        }

//        ArrayList<int> myIntList = new ArrayList<int>(); // It's not possible to use arraylist for primitive types. That is why we will use autoboxing & unboxing


        // Autoboxing
        Integer myIntValue = 56; // Integer.valueOf(56);  --> Autoboxing
        int myInt = myIntValue; // myIntValue.intValue()  --> Unboxing

        System.out.println("My Int: " + myInt);

        ArrayList<Integer> myIntegerList = new ArrayList<>();
        int i;
        for (i = 0; i < 10; i++) {
            myIntegerList.add(Integer.valueOf(i));
        }

        // Unboxing
        for (i = 0; i < myIntegerList.size(); i++) {
            System.out.println(i + " --> " + myIntegerList.get(i)); // System.out.println(i + " --> " + myIntegerList.get(i).intValue());
        }
    }
}
