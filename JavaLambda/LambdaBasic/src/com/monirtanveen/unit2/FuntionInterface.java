package com.monirtanveen.unit2;

import com.monirtanveen.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FuntionInterface {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charlie", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mattew", "Arnold", 39)
        );

        // Step 1: Print All
//        printAll(people);

        // Step 2: Sort List By Last Name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 3: Print All Sorted List
//        printConditionally(people, p -> true);

        // Step 4: Create a method that prints all people that have last name beginning with C
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        // Step 4: Create a method that prints all people that have first name beginning with C
        printConditionally(people, p -> p.getFirstName().startsWith("C"));
    }

    private static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people) {
            if (predicate.test(p)) {
                System.out.println(p);
            }
        }
    }
}
