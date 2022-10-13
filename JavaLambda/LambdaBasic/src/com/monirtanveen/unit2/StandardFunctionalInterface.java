package com.monirtanveen.unit2;

import com.monirtanveen.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterface {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charlie", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mattew", "Arnold", 39)
        );

        // Step 2: Sort List By Last Name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 3: Print All Sorted List
        performConditionally(people, p -> true, p -> System.out.println(p));

        // Step 4: Create a method that prints all people that have last name beginning with C
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        // Step 4: Create a method that prints all people that have first name beginning with C
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
