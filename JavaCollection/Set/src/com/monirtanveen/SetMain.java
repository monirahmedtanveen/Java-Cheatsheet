package com.monirtanveen;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

        Set<String> nameHash = new HashSet<>();
        nameHash.add("Walter");
        nameHash.add("White");
        System.out.println(nameHash);

        System.out.println(nameHash.contains("Walt"));

        Set<String> nameTree = new TreeSet<>();
        nameTree.add("Monir");
        nameTree.add("Ahmed");
        System.out.println(nameTree);

        System.out.println(nameTree.contains("Ahmed"));
    }
}
