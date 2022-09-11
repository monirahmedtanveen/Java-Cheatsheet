package com.monirtanveen;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Set<String> names = new HashSet<>();
        names.add("Name A");
        names.add("Name B");
        System.out.println(names);

        boolean result = names.add("Name A");
        System.out.println(names);
        System.out.println(result);

        names.remove("Name A");
        System.out.println(names);

        System.out.println(names.contains("Name B"));
    }
}
