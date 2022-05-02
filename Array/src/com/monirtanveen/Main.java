package com.monirtanveen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//	    int[] myIntArray = new int[10]; // {1,2,3,4,5,6,7,8,9,10}
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//
//        int[] mySecondIntArray = getIntegers(5);
//        printArray(mySecondIntArray);
//        System.out.println("Average : " + getAverage(mySecondIntArray));
//
        int[] arrayOne = new int[5];
        int[] arrayTwo = arrayOne;

        System.out.println("First Array : " + Arrays.toString(arrayOne));
        System.out.println("Second Array : " + Arrays.toString(arrayTwo));

        arrayTwo[2] = 5;

        System.out.println("After Changed First Array : " + Arrays.toString(arrayOne));
        System.out.println("After Changed Second Array : " + Arrays.toString(arrayTwo));

        arrayTwo = new int[]{1, 5, 6};
        modifyArray(arrayOne);

        System.out.println("After Modify First Array : " + Arrays.toString(arrayOne));
        System.out.println("After Modify Second Array : " + Arrays.toString(arrayTwo));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
    }

    public static void printArray(int[] myIntArray) {
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
