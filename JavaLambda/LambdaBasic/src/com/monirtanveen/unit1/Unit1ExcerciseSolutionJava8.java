package com.monirtanveen.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charlie", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mattew", "Arnold", 39)
        );

        // Step 1: Sort list by name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        printConditionally(people, p -> true);

        // Step 3: Create a method that prints all people that have last name beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        printConditionally(people, p -> p.getFirstName().startsWith("C"));
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    // Predicate is a functional interface built-in
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }
}
