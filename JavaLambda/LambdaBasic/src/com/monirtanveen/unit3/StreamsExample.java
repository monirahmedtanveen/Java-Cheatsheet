package com.monirtanveen.unit3;

import com.monirtanveen.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charlie", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mattew", "Arnold", 39)
        );

        System.out.println("Using lambda foreach loop");
        people.forEach(p -> System.out.println(p.getFirstName()));

        System.out.println();
        System.out.println("Using stream: print all first name which last name starts with C");
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        System.out.println("Number of peoples last name starts with C : " + count);

        System.out.println("Parallel Stream");
        people.parallelStream()
                .filter(p -> p.getFirstName().startsWith("M"))
                .forEach(System.out::println);
    }
}
