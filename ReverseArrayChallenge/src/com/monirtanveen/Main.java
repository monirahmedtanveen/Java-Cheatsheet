package com.monirtanveen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] originalArray = new int[5];

        System.out.println("Enter Array Element: ");
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.println("Orginal Array: " + Arrays.toString(originalArray));
        System.out.println("Reverse Array: " + Arrays.toString(reverse(originalArray)));
    }
    private static int[] reverse(int[] originalArray) {
        int[] reverseArray = new int[originalArray.length];

        int j = 0;
        for (int i = originalArray.length - 1; i >= 0; i--) {
            reverseArray[j++] = originalArray[i];
        }

        return reverseArray;
    }
}
