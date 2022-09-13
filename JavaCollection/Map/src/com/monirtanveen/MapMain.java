package com.monirtanveen;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        Student student1 = new Student("Foo", "Bar", 2, "Science");
        Student student2 = new Student("Bar", "Baz", 1, "Commerce");
        Student student3 = new Student("Blah", "Bar", 3, "Arts");

        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);

        System.out.println(studentMap);

        System.out.println(studentMap.get(1));

        studentMap.put(200, null);

        System.out.println(studentMap.get(200));
        System.out.println(studentMap.get(300));

        for (Integer key : studentMap.keySet()) {
            System.out.println(key);
        }

        for (Student value : studentMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(
                studentMap.getOrDefault(100, new Student("Test", "Test", 100, "Commerce"))
        );

        studentMap.putIfAbsent(1, new Student("Test", "Test", 100, "Commerce"));
        System.out.println(studentMap);

        studentMap.forEach((key, value) -> System.out.println(value));

        System.out.println(studentMap.computeIfAbsent(200, key -> new Student("Test", "Test", key, "Commerce")));
        System.out.println(studentMap.get(200));

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
