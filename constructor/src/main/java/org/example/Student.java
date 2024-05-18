package org.example;

public class Student {
    String name;
    String id;
    double gpa;
    int age;

    public Student(String name, String id, double gpa, int age) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.age = age;

        System.out.println(name);
        System.out.println(id);
        System.out.println(gpa);
        System.out.println(age);
    }
}
