package com.monirtanveen;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[10];
        int[] myAnotherArray = new int[15];
        Date[] dates = new Date[20];

        myArray[0] = 3000;
        dates[10] = new Date();

        System.out.println("Two Arrays are equals : " + Arrays.equals(myArray, myAnotherArray));

        System.out.println("Hello World! " + myArray[0] + ", Today is " + dates[10]);

        String[] names = new String[20];

        Arrays.fill(names, "Walter ");

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i] + i;
        }

        System.out.println("Position of walter 4 : " + Arrays.binarySearch(names, "Walter 4"));
    }
}
