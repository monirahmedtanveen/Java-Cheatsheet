package com.monirtanveen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static  int[] baseArray = new int[10];

    public static void main(String[] args) {
        getInput();

        System.out.println("Before Resizing: " + Arrays.toString(baseArray));

        resizeArray();

        baseArray[10] = 65;
        baseArray[11] = 75;

        System.out.println("After Resizing: " + Arrays.toString(baseArray));
    }

    private static void getInput() {
        System.out.println("Enter Array Element: ");
        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = scanner.nextInt();
        }
    }

    private static void resizeArray() {
        int[] copyArray = baseArray;
        baseArray = new int[12];
        for (int i = 0; i < copyArray.length; i++) {
            baseArray[i] = copyArray[i];
        }
    }
}
