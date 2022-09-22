package com.monirtanveen;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printNumbers(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(4d);
        doubles.add(5d);
        printNumbers(doubles);

        List<String> foo = new ArrayList<>();
//        printNumbers(foo); // This will not work

        List<Number> numbers = new ArrayList<>();
        addToList(numbers, 1.0);
        addToList(numbers, 2);

        System.out.println(numbers.get(1));
    }

    private static void addToList(List<? super Number> numbers, Number i) {
        numbers.add(i);
    }

    private static void printNumbers(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
    }
}


// PECS --> Producer Extend Consumer Super

// if reading from generics, generics is producer. use extends (upperbound)
// if writting to generics, generics is consumer. use super (lowerbound)
