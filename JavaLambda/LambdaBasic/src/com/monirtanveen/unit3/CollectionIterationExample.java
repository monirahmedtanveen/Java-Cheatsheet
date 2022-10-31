package com.monirtanveen.unit3;

import com.monirtanveen.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charlie", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mattew", "Arnold", 39)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for each loop");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using lambda foreach loop");
        people.forEach(p -> System.out.println(p));

        System.out.println("Using lambda foreach loop and method reference");
        people.forEach(System.out::println);
    }
}
