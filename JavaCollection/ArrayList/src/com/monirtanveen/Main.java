package com.monirtanveen;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            names.add("name " + i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Hello World! Index of name 5 " + names.indexOf("name 5"));

        System.out.println("Using iterator");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Using Foreach");
        for (String name : names) {
            System.out.println(name);
        }

        Student student1 = new Student("Foo", "Bar", 1, "Science");
        Student student2 = new Student("Foo", "Bar", 1, "Science");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Student st1 = new Student("Walt", "White", 2, "Science");
        Student st2 = new Student("Jessi", "Pinkman", 1, "Science");
        Student st3 = new Student("Saul", "Goodman", 3, "Science");

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        students.sort(null); // It will look for comparable interface we are implemented in Student class. It will sort by ID (compareTo method)

        System.out.println(students);

        Student st4 = new Student("Walt", "Akram", 5, "Science");
        Student st5 = new Student("Jessi", "Pinkman", 6, "Science");
        Student st6 = new Student("Saul", "Goodman", 4, "Science");

        ArrayList<Student> stCustomComparator = new ArrayList<>();
        stCustomComparator.add(st4);
        stCustomComparator.add(st5);
        stCustomComparator.add(st6);

        stCustomComparator.sort(new StudentLastNameComparator()); // Custom Comparator

        System.out.println("Custom Comparator");
        System.out.println(stCustomComparator);
    }
}
