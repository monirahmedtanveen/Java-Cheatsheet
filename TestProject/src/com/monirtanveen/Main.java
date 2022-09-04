package com.monirtanveen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hello World");
//        var a = 25;
//        System.out.println("a=" + a);
//        System.out.println("Enter value for a = ");
//        a = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("A = " + a);
//
//        int population = 25_00_000;
//        System.out.println("Population: " + population);

        int slNos[] = new int[10];
        int slNos2[] = {1, 2, 3, 5};
        int matrix[][] = new int[3][5];
        int matrix2[][] = new int[3][];

        matrix2[0] = new int[5];
        matrix2[1] = new int[7];
        matrix2[2] = new int[8];

        int matrix3[][] = {
                {1, 2, 3},
                {3, 5, 6},
                {7, 8, 10}
        };

        slNos[0] = 5;
        slNos[1] = 2;

        System.out.println("SlNos: " + Arrays.toString(slNos));
        System.out.println("SlNos2: " + Arrays.toString(slNos2));

        System.out.println("matrix: " + Arrays.toString(matrix[0]));
        System.out.println("matrix: " + Arrays.toString(matrix2[2]));
        System.out.println("matrix: " + Arrays.toString(matrix3[2]));

        int sumNumbers[] = {1,2,5,3,6,8,9,5};
        int total = 0;
        for (var i : sumNumbers) {
            total += i;
        }

        System.out.println("Total: " + total);

        for (int[] subArray:
             matrix3) {
            for (int element:
                 subArray) {
                System.out.println("Element is: " + element);
            }
        }

        final double PI = 3.1416;
        System.out.println("PI:- " + PI);

        final String COMPANY_NAME = "Newroz Technology";
        System.out.println("Company Name: " + COMPANY_NAME);
    }
}
