package com.monirtanveen;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int id;
    private String department;

    public Student(String firstName, String lastName, int id, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(lastName, student.lastName)) return false;
        return Objects.equals(department, student.department);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }
}
